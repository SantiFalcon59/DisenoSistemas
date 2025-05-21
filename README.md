# Patrones de Diseño Identificados

## Chain of Responsibility

Podemos identificar este patrón ya que tenemos una **cadena de responsables**, en este caso, encargados. Cada encargado tiene una responsabilidad distinta sobre las excusas que puede aceptar, y puede derivarlas al siguiente encargado si no puede procesarla.

- **Handler**: `Encargado`
- **Concrete Handlers**: `Recepcionista`, `Supervisor de Área`, `Gerente de Recursos Humanos`, `CEO`
- **Request**: `Excusa`

---

## Observer

Este patrón se identifica porque necesitamos **notificar automáticamente a los CEOs** ante una acción específica.

- **Subject (Objeto observado)**: `Prontuario`
- **Observer**: `CEO`

---

## Singleton

Se utiliza este patrón para asegurarse de que **solo exista un único administrador de prontuarios**, compartido por todos los gerentes. El Singleton garantiza una única instancia global de la clase.

- **Singleton**: `AdministradorProntuarios`

---

## Strategy

Identificamos este patrón por el comportamiento **dinámico de los encargados** según el modo de acción, que puede cambiar en tiempo de ejecución.

- **Strategy**: `ModoAccion`
- **Concrete Strategies**: `ModoNormal`, `ModoVago`, `ModoProductivo`


# Diagrama de clases UML

```mermaid
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
    class GerenteRRHH

    class Excusa
    class ComplejaExcusa 
    class InverosimilExcusa
	class ModeradaExcusa
	class TrivialExcusa
	class CorteLuzExcusa
	class CuidarFamiliarExcusa
	class DormidoExcusa
	class TransporteExcusa
	
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
	Encargado <|-- GerenteRRHH
    Encargado <|-- Recepcionista
    Encargado <|-- SupervisorArea
    Encargado <|-- EncargadoDefault

    IExcusa <|.. Excusa

    Excusa <|.. ComplejaExcusa
    Excusa <|.. InverosimilExcusa
    Excusa <|.. ModeradaExcusa
    Excusa <|.. TrivialExcusa
	
    TrivialExcusa <|.. DormidoExcusa
    TrivialExcusa <|.. TransporteExcusa
    ModeradaExcusa <|.. CorteLuzExcusa
    ModeradaExcusa <|.. CuidarFamiliarExcusa

    ModoAccion <|.. ModoNormal
    ModoAccion <|.. ModoProductivo
    ModoAccion <|.. ModoVago

    Observable~ProntuarioObserver, Prontuario~ <|.. ProntuarioObject
    ProntuarioObject <|-- AdministradorProntuarios
    IProntuario <|.. Prontuario
    CEO *-- AdministradorProntuarios

    ProntuarioObserver --> ProntuarioObject
    CEO ..|> ProntuarioObserver
```

%% Diagrama de Casos de Uso
%% Representa interacciones principales entre los actores y el sistema

```flowchart
flowchart TD
  subgraph Actores
    Empleado
    Encargado
    CEO
  end

  Empleado --> EnviarExcusa
  EnviarExcusa --> ProcesarExcusa
  Encargado --> ProcesarExcusa
  ProcesarExcusa --> Delegar
  ProcesarExcusa --> EvaluarModo
  ProcesarExcusa --> RegistrarProntuario
  RegistrarProntuario --> Notificar
  Notificar --> NotificacionCEO
  CEO --> NotificacionCEO
  CEO --> ConsultarProntuario
  Encargado --> CambiarModo

```
