$(document).ready(function(){
    $(".form-add").hide();
    $(".bg-form-show").hide();
    $(".btn-add").click(function(){
      $(".form-add").show();
      $(".bg-form-show").show();
    });
    $("#close-form").click(function(){
      $(".form-add").hide();
      $(".bg-form-show").hide();
    });

});