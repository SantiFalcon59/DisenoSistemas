´´´mermaid
classDiagram
    %% Interfaces
    class IEmpleado
    class IEncargado {
        +manejarExcusa(IExcusa excusa)
        +setSiguiente(IEncargado siguiente)
        +setModo(ModoAccion modo)
    }
    class IExcusa {
        +procesar(IEncargado encargado)
    }
    class ManejadorExcusas
    class ModoAccion {
        +manejar(IEncargado encargado, IExcusa excusa)
    }
    class IProntuario
    class Observable~ProntuarioObserver, Prontuario~

    %% Clases concretas
    class Empleado
    class Encargado
    class CEO
    class EncargadoDefault
    class Recepcionista
    class SupervisorArea

    class Excusa

    class ModoNormal
    class ModoProductivo
    class ModoVago

    class AdministradorProntuarios
    class Prontuario
    class ProntuarioObject
    class ProntuarioObserver

    %% Herencias / Implementaciones
    IEmpleado <|.. Empleado
    Empleado <|-- Encargado
    ManejadorExcusas <|.. Encargado
    IEncargado <|.. Encargado

    Encargado <|-- CEO
    Encargado <|-- Recepcionista
    Encargado <|-- SupervisorArea
    Encargado <|-- EncargadoDefault

    IExcusa <|.. Excusa

    ModoAccion <|.. ModoNormal
    ModoAccion <|.. ModoProductivo
    ModoAccion <|.. ModoVago

    Observable~ProntuarioObserver, Prontuario~ <|.. ProntuarioObject
    ProntuarioObject <|-- AdministradorProntuarios
    IProntuario <|.. Prontuario
    CEO *-- AdministradorProntuarios

    ProntuarioObserver --> ProntuarioObject
    CEO ..|> ProntuarioObserver
´´´