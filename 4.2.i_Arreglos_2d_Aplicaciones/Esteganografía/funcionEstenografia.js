/* 
 * Funciones que permiten 
 */

var himg = null, fimg = null;
var bluffI = null;

/*
Función que carga la imagen que sevirá
de pantalla para ocultar la otra imagen.
*/
function uploadF(){
  var fileInput = document.getElementById("finput");
  var canvas2 = document.getElementById("d1");
  fimg = new SimpleImage(fileInput);
  fimg.drawTo(canvas2);
}


/*
Función que carga la imagen a ocultar
*/
function uploadHF(){
  var hideFileInput =              
      document.getElementById("hfinput");
  var canvas1 = document.getElementById("d2");
  himg = new SimpleImage(hideFileInput);
  himg.drawTo(canvas1);
}


/*
Función que es oculta el mensaje
*/
function hideMessage(){
  var x,y, aCIb=[], aCIh=[];
  var hpix, opix;
  var nr, ng , nb;
  var hscreen = document.getElementById("hideS");
  if( fimg === null || !fimg.complete())
     {
       alert("Image bluff not loaded");
       return;
     }
   if( himg === null || !himg.complete())
     {
       alert("Image to hide not loaded");
       return;
     }
     
    if(!matchImage())
      {
        alert("Image bluff must be in size, equal or more larger that the image to hide");
       return;
      }
  bluffI = new SimpleImage(fimg.getWidth(), fimg.getHeight());
  
  for(var pix of fimg.values() ){
    x = pix.getX();
    y = pix.getY();
   
    hpix = himg.getPixel(x,y);
    aCIb = getSignificant(pix);
    aCIh = getSignificant(hpix);
    opix = bluffI.getPixel(x,y);
    nr = aCIb[0]*16 + aCIh[0];
    ng = aCIb[1]*16 + aCIh[1];
    nb = aCIb[2]*16 + aCIh[2];
    opix.setRed(nr);
    opix.setGreen(ng);
    opix.setBlue(nb);      
  }
  bluffI.drawTo(hscreen);
}



function getMessage(){
  var nr, ng , nb;
  var hscreen = document.getElementById("hideS");
  if( bluffI === null || !bluffI.complete())
     {
       alert("Not hide message finded");
       return;
     }
   
  for(var pix of bluffI.values() ){
    nr = pix.getRed();
    ng = pix.getGreen();
    nb = pix.getBlue(); 
    nr= (nr%16)*16;
    ng= (ng%16)*16;
    nb= (nb%16)*16;
    
    pix.setRed(nr);
    pix.setGreen(ng);
    pix.setBlue(nb);      
  }
  bluffI.drawTo(hscreen);
}

function getSignificant(pixel){
  var r,g,b, arrayColor;
  r = pixel.getRed();
  g = pixel.getGreen();
  b = pixel.getBlue();
  r = Math.floor(r/16);
  g = Math.floor(g/16);
  b = Math.floor(b/16);
  arrayColor = [r,g,b];
  return arrayColor;
}

function matchImage(){
  var w =  himg.getWidth();
  var h =  himg.getHeight();
  if (fimg.getWidth() < w || fimg.getHeight() < h){
    return false;
  }
    else if(fimg.getWidth() > w || fimg.getHeight() > h){
      fimg = crop(fimg, w, h);
      return true;
    }else{
       return true;
    }
}

function crop(image,
width, height){
    print(width);
  var nimage = new SimpleImage(width, height); 
    for(var i = 0; i< width; i++){
      for(var j = 0; j< height; j++){
        nimage.setPixel(i,j,image.getPixel(i,j));
      }
    }
  return nimage;
}

function clearCanvas(){
   var canvas1 = document.getElementById("d1");
  var canvas2 = document.getElementById("d2");
  var hscreen = document.getElementById("hideS");
  var cd1 = canvas1.getContext("2d");
  var cd2 = canvas2.getContext("2d");
  var cgs = hscreen.getContext("2d");
  cd1.clearRect(0,0,canvas1.width, canvas1.height);       
  cd2.clearRect(0,0,canvas2.width, canvas2.height );
  cgs.clearRect(0,0,hscreen.width, hscreen.height);
  fimg = null;
  himg = null;
}

