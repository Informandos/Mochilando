<!DOCTYPE html>
<html>
    <head>
        <title>Editar Preferências</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">

        <!-- Latest compiled and minified CSS -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

        <!-- CSS -->
        <style type="text/css">
            .check {
                opacity:0.5;
                color:#996;    
            }
        </style>

        <!-- jQuery library -->
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

        <!-- Latest compiled JavaScript -->
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

        <!-- JavaScript -->
        <script>
            $(document).ready(function (e) {
                $(".img-check").click(function () {
                    $(this).toggleClass("check");
                });
            });
        </script>
    </head>
    <body>
        <div class="container">
            <form action="Servlet" method="POST">
                <h1 align="center">Selecione suas Preferências</h1>
                <div class="form-group" align="center">
                    <div class="row">
                        <div class="col-md-3">
                            <label class="btn btn-primary">
                                <img src="../img/montanha.jpg" alt="..." class="img-thumbnail img-check">
                                <input type="checkbox" name="pref1" id="item1" value="montanha" class="hidden" autocomplete="off">
                            </label>
                        </div>
                        <div class="col-md-3">
                            <label class="btn btn-primary">
                                <img src="../img/praia.jpg" alt="..." class="img-thumbnail img-check">
                                <input type="checkbox" name="pref2" id="item2" value="praia" class="hidden" autocomplete="off">
                            </label>
                        </div>
                        <div class="col-md-3">
                            <label class="btn btn-primary">
                                <img src="../img/interior.jpg" alt="..." class="img-thumbnail img-check">
                                <input type="checkbox" name="pref3" id="item3" value="interior" class="hidden" autocomplete="off">
                            </label>
                        </div>
                        <div class="col-md-3">
                            <label class="btn btn-primary">
                                <img src="../img/cidade.jpg" alt="..." class="img-thumbnail img-check">
                                <input type="checkbox" name="pref4" id="item4" value="cidade" class="hidden" autocomplete="off">
                            </label>
                        </div>
                    </div>
                    <br>
                    <div align="center">
                        <input align="center" type="submit" name="Salvar" value="Salvar" class="btn btn-default"> <input align="center" type="button" name="Cancelar" value="Cancelar" class="btn btn-default">
                    </div>

                </div>
            </form>
        </div>
    </body>
</html>