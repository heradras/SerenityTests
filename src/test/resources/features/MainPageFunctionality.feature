Feature: Correcta redireccion de las pestañas hijas para navegacion entre paginas en mainPage
  Como usuario quiero dar click a las pestañas hijas de las categorias para remitirme a las diferentes paginas.

  Scenario Outline: Acceder a la tarjeta Elements
    Given que un nuevo usuario accede hasta la web demoqa
    When el hace click en la tarjeta elementsCard
    And el usuario hace click en la pestaña <BoxName> de los elementos desplegados
    Then ve la pagina con titulo <DisplayedTitle>

    Examples:
      |  BoxName           |    DisplayedTitle     |
      | textBox            | Text Box              |
      | checkBox           | Check Box             |
      | radioButton        | Radio Button          |
      | webTables          | Web Tables            |
      | buttons            | Buttons               |
      | links              | Links                 |
      | brokenLinks-Images | Broken Links - Images |
      | uploadAndDownload  | Upload and Download   |
      | dynamicProperties  | Dynamic Properties    |


  Scenario Outline: Acceder a la tarjeta Forms
    Given que un nuevo usuario accede hasta la web demoqa
    When el hace click en la tarjeta formsCard
    And el usuario hace click en la pestaña <BoxName> de los elementos desplegados
    Then ve la pagina con titulo <DisplayedTitle>

    Examples:
      |  BoxName           |    DisplayedTitle     |
      | practiceForm       | Practice Form         |

  Scenario Outline: Acceder a la tarjeta Alerts Frames & Windows
    Given que un nuevo usuario accede hasta la web demoqa
    When el hace click en la tarjeta afwCard
    And el usuario hace click en la pestaña <BoxName> de los elementos desplegados
    Then ve la pagina con titulo <DisplayedTitle>

    Examples:
      |  BoxName           |    DisplayedTitle     |
      | browserWindows     | Browser Windows       |
      | alerts             | Alerts                |
      | frames             | Frames                |
      | nestedFrames       | Nested Frames         |
      | modalDialogs       | Modal Dialogs         |

  Scenario Outline: Acceder a la tarjeta Widgets
    Given que un nuevo usuario accede hasta la web demoqa
    When el hace click en la tarjeta widgetsCard
    And el usuario hace click en la pestaña <BoxName> de los elementos desplegados
    Then ve la pagina con titulo <DisplayedTitle>

    Examples:
      |  BoxName           |    DisplayedTitle     |
      | accordian          | Accordian             |
      | autoComplete       | Auto Complete         |
      | datePicker         | Date Picker           |
      | slider             | Slider                |
      | progressBar        | Progress Bar          |
      | tabs               | Tabs                  |
      | toolTips           | Tool Tips             |
      | menu               | Menu                  |
      | selectMenu         | Select Menu           |
  @asd
  Scenario Outline: Acceder a la tarjeta Interactions
    Given que un nuevo usuario accede hasta la web demoqa
    When el hace click en la tarjeta interactionsCard
    And el usuario hace click en la pestaña <BoxName> de los elementos desplegados
    Then ve la pagina con titulo <DisplayedTitle>

    Examples:
      |  BoxName           |    DisplayedTitle     |
      | sortable           | Sortable              |
      | selectable         | Selectable            |
      | resizable          | Resizable             |
      | droppable          | Droppable             |
      | dragabble          | Dragabble             |

  Scenario Outline: Acceder a la tarjeta Book Store Application
    Given que un nuevo usuario accede hasta la web demoqa
    When el hace click en la tarjeta bsaCard
    And el usuario hace click en la pestaña <BoxName> de los elementos desplegados
    Then ve la pagina con titulo <DisplayedTitle>

    Examples:
      |  BoxName           |    DisplayedTitle     |
      | login              | Login                 |
      | bookStore          | Book Store            |
      | profile            | Profile               |