Sample project of integration of cucumber with selenium for UI testing.
The aim is to show an example of UI-framework-agnostic (selenium in this case) UI tests. Selenium in this case is used just as an implementation of a test model.

---
Example
---

Instead of working with selenium directly in cucumber steps' implementation, it is possible to work with nice abstractions that are implemented by selenium code behind and automatically wired by IoC Container (PicoContainer).
