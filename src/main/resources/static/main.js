/**
 *
 */

$('document').ready(function () {

    $('.table .btn-warning').on('click', function(event){

        event.preventDefault();
        const href = $(this).attr('href');

        $.get(href, function (car, status) {
            $('#idEdit').val(car.Id);
            $('#markEdit').val(car.model);
            $('#modelEdit').val(car.mark);
            $('#colorEdit').val(car.color);

        });

        $('#editModal').modal();
    });
});