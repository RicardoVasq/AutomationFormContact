#  Automatización del Formulario de Contacto – Elaniin

Este proyecto contiene un test automatizado con Selenium que simula el flujo de usuario para ingresar al sitio de Elaniin, navegar a la sección **Contact Us**, completar el formulario con datos de prueba y validar el envío exitoso.

---

##  Flujo Automatizado

1. Abrir el sitio [https://www.elaniin.com](https://www.elaniin.com)
2. Navegar hasta la sección **Contact Us**
3. Completar todos los campos del formulario:
   - Nombre
   - Correo electrónico
   - Empresa
   - Número de teléfono
   - Mensaje
4. Enviar el formulario
5. Validar que se muestre una confirmación de envío exitoso

---

##  Tecnologías Utilizadas

- **Lenguaje:** Java 17+
- **Framework de pruebas:** TestNG
- **Automatización:** Selenium WebDriver 4.x
- **Gestión de drivers:** WebDriverManager
- **Reporte de resultados:** Allure Report *(opcional)*
- **Build tool:** Maven

---
