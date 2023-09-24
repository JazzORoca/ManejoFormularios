function validarForma(forma) {
    var usuario = forma.usuario;
    if (usuario.value === "" || usuario.value === "Escribir usuario") {
        alert("Debe proporcionar un nombre de usuario");
        usuario.focus();
        usuario.select();
        return false;
    }

    var password = forma.password;
    if (password.value === "" || password.value.length < 3) {
        alert("Debes proporcionar una contraseña de al menos 3 caracteres");
        password.focus();
        password.select();
        return false;
    }

    var tecnologias = forma.tecnologia;
    var checkSeleccionado = false;
    for (var i = 0; i < tecnologias.length; i++) {
        if (tecnologias[i].checked) {
            checkSeleccionado = true;
            break; // Rompemos el bucle si se encontró una tecnología seleccionada
        }
    }
    if (!checkSeleccionado) {
        alert("Debe seleccionar al menos una tecnología");
        return false;
    }

    var genero = forma.genero;
    var radioSeleccionado = false;
    for (var i = 0; i < genero.length; i++) {
        if (genero[i].checked) {
            radioSeleccionado = true;
            break; // Rompemos el bucle si se encontró un género seleccionado
        }
    }
    if (!radioSeleccionado) {
        alert("Debe seleccionar un género");
        return false;
    }

    var ocupacion = forma.ocupacion;
    if (ocupacion.value === "default") {
        alert("Debes seleccionar una ocupación");
        return false;
    }

    // Formulario es válido
    alert("Formulario válido, enviando datos al servidor...");
    return true;
}


