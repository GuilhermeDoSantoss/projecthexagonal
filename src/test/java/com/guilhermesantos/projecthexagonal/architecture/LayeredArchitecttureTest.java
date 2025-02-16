package com.guilhermesantos.projecthexagonal.architecture;

@AnalyzeClassees(packages = "com.guilhermesantos.projecthexagonal")
@SpringBootTest
public class LayeredArchitecttureTest {


    @ArchTest
    public static final ArchRule layered_architecture_test = layreedArchitecture()
            .consideringAllDependencies()
            .layer("AdaptersIn").definedBy("..adapters.in..")
            .layer("AdaptersOut").definedBy("..adapters.out..")
            .layer("UseCase").definedBy("..application.core.usecase..")
            .layer("PortsIn").definedBy("..application.ports.in..")
            .layer("PortsOut").definedBy("..application.ports.out..")
            .layer("Config").definedBy("..config..")
            .whereLayer("AdaptersIn").mayOnlyBeAcessedByLayers("Config")
            .whereLayer("AdaptersOut").mayOnlyBeAcessedByLayers("Config")
            .whereLayer("UseCase").mayOnlyBeAcessedByLayers("Config")
            .whereLayer("PortsIn").mayOnlyBeAcessedByLayers("UseCase", "AdaptersIn")
            .whereLayer("PortsOut").mayOnlyBeAcessedByLayers("UseCase", "AdaptersOut")
            .whereLayer("Config").mayNotBeAccessedByAnyLayer();
}
