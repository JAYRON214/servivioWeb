/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/javascript.js to edit this template
 */


async function guardarExperiencia() {
    const data = {
        empresa: document.getElementById('empresa').value,
        cargo: document.getElementById('cargo').value,
        fechaInicio: document.getElementById('fechaInicio').value,
        fechaFin: document.getElementById('fechaFin').value
    };

    const response = await fetch("http://localhost:8080/experiencias", {
        method: "POST",
        headers: { "Content-Type": "application/json" },
        body: JSON.stringify(data)
    });

    if (response.ok) {
        alert("Experiencia guardada con éxito");
    } else {
        alert("Error al guardar");
    }
}
