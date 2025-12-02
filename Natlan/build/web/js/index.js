$(document).ready(function() {
    
    $ ('#loginUsuario, #loginPassword').on('input', function() {
        $(this).removeClass('is-invalid');
        $(this).next('.error-message').hide();
    });
});

function openRegisterPage(e) {
    e.preventDefault();
    window.location.href = 'registroUsuarios.html';
}