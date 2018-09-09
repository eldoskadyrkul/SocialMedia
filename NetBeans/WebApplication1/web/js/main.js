function openNavbar () {
    document.querySelector("#navbar").style.width="100%";
    document.querySelectorAll(".open")[0].style.opacity = 0;
    document.querySelector(".main_wrapper").style.cssText="display:none;";
}
function closeNavbar () {
    document.querySelector("#navbar").style.width="0";
    document.querySelectorAll(".open")[0].style.opacity = 1;
   document.querySelector(".main_wrapper").style.cssText="display:block;";
}
function aboutVersion() {
    alert("ЖГУ v.0.0.1");
}
function linkRaspisanie() {
    window.location.href="raspisanie/";
}
function linkJournal() {
    window.location.href="zhournal/";
}