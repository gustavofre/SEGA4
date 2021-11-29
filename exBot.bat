@echo off 
echo VAI FAZER O PAGAMENDO DE USD2,000,000.00? 
set /p resposta=
if %resposta%==sim goto obrigado 
if %resposta%==nao goto denada 
:obrigado
echo Por enquanto o seu computador está a salvo
echo Até mais 
pause 
exit
:denada
echo ISSO NÃO É UM TESTE, O SEU COMPUTADOR VAI DESLIGAR EM 10 SEGUNDOS
timeout 10
pause exit