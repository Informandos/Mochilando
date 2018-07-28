/* 
 Todo que o programa fazer na parte nos html deve passa aqui para depois ir para o controller
 */

function validarCamposLogin() {
    var frm = document.frmLogin;
    var email = frm.email.value;
    var senha = frm.senha.value;

    if (email == "") {
        alert("Favor, preencha o campo email!");
        frm.email.focus();
        return false;
    } else if (senha == "") {
        alert("Favor, preencha o campo senha!");
        frm.senha.focus();
        return false;
    } else {
        caminhourl = "/Mochilando/ServletWeb?acao=Logar";
        document.forms[0].action = caminhourl;
        window.document.forms[0].submit();
        return true;
    }
}
/*
 separe cada fução 
 */
/*---------------------------------------------------------------------------------------------------*/
