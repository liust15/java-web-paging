'use strict';
$.test = function () {
    $.get("mainservlet", function (users) {
        let toutiao = ''
        for (let tr of users) {
            toutiao += " <div class ='item'> <div>" +
                " <img src='" + tr.image_url + "' />  </div>" +
                " <div class='item_title'>" +
                "<h3>" + tr.title + "</h3>" +
                " <p>作者:<span>" + tr.media_name + "</span> </p>" +
                "</div>" +
                " </div>"
        }
        $("#toutiao").append(toutiao);
    });

}
$.serach = function () {
    $(".button").click(function () {
        let a = $("#wbk").val();
        $.post("../serach/", {serach: a}, function (users) {
            let toutiao = ''
            for (let tr of users) {
                toutiao += " <div class ='item'> <div>" +
                    " <img src='" + tr.image_url + "' />  </div>" +
                    " <div class='item_title'>" +
                    "<h3>" + tr.title + "</h3>" +
                    " <p>作者:<span>" + tr.media_name + "</span> </p>" +
                    "</div>" +
                    " </div>"
            }
            $("#toutiao").empty().append(toutiao);
        });
    })


}
