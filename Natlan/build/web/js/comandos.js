$(document) .ready(function() {
    $(".toggle-info").click(function() {
        $(this).closest(".card-body").find(".card-text").slideToggle();
        if ($(this).text() === " info ") {
            $(this).text(" oculto ");
        } else {
            $(this).text(" info ");
        } 
    })

});