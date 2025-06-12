#!/bin/bash

echo "Ejecutando tests con Maven..."

# Ejecutar los tests y generar los resultados para Allure
mvn clean test

# Generar reporte Allure en la carpeta "allure-report"
echo "Generando reporte Allure..."
allure generate target/allure-results --clean -o allure-report

# Mostrar reporte en el navegador
echo "Abriendo reporte Allure..."
allure open allure-report
