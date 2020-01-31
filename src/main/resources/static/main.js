/**
 *
 */

$('document').ready(function () {

    $('.table .btn-warning').on('click', function(event){
        console.log('siema')
        event.preventDefault();

        $('#editModal').modal();
    });
});