<?php
$nombre = readline("veuillez saisie un numbre: ");
$reste = $nombre%2;
if ($reste == 0){
    echo "le nombre $nombre est pair";
}else{
    echo "le nombre $nombre est impair";
}
?>