
window.onload = function () {
  var parca = document.URL;
  var array = [];
  var array1 = [];
  var array2 = [];
  const yeni = parca.split("=");

  document.getElementById("sehirr").innerHTML = yeni[1];


  var table = document.getElementById("sehirTable");
  var divDeger = document.getElementById("urunler");
  var sakla = "";
  var divDeger1 = document.getElementById("restorant");
  var sakla2 = "";
  var divDeger2 = document.getElementById("gezilecekYerler");
  var sakla3 = "";
  fetch("http://localhost:8080/sehirUrun/getAll/" + yeni[1])
    .then((response) => response.json())
    .then((result) => {
      sakla =
        sakla +
        ("<div class='row'><h1 style='color: black; font-size: 30px;'>" +result[0].sehirAdiTurkce +"'a ÖZGÜ ALINABİLECEK ÜRÜNLER</h1><br><div class='col-md-6'><div class='widget-item'><div class='sample-thumb'><img src='" +result[0].urun_fotograf +"'alt='sehir' title='sehir' style='height: 350px;'></div><h4 class='consult-title'><b>" +result[0].urun_baslik +"</b></h4></div></div><div class='col-md-6'><div class='widget-item'><div class='sample-thumb'><img src='" +result[1].urun_fotograf +"' alt='company' title='company' style='height: 350px;'></div><h4 class='consult-title'><b>" +result[1].urun_baslik +"</b></h4></div></div></div><div class='row'><div class='col-md-6'><div class='widget-item'><div class='sample-thumb'><img src='" +result[2].urun_fotograf +"' alt='company' title='company' style='height: 350px;'></div><h4 class='consult-title'><b>" + result[2].urun_baslik +"</b></h4></div></div></div>");
      divDeger.innerHTML = sakla;
    });

  fetch("http://localhost:8080/sehirRestorant/getAll/" + yeni[1])
    .then((response) => response.json())
    .then((result) => {
      sakla2 =
        sakla2 +
        ("<div class='row'><h1 style='color: black; font-size: 30px;'>GİDİLMESİ GEREKEN RESTORANTLAR</h1><div class='col-md-6'><div class='widget-item'><div class='sample-thumb'><img src='" +result[0].fotograf_restorant +"'alt='sehir' title='sehir' style='height: 350px;'></div><h4 class='consult-title'><b>" +result[0].restorant_Adi +"</b></h4></div></div><div class='col-md-6'><div class='widget-item'><div class='sample-thumb'><img src='" +result[1].fotograf_restorant +"' alt='company' title='company' style='height: 350px;'></div><h4 class='consult-title'><b>" +result[1].restorant_Adi +"</b></h4></div></div>");
      divDeger1.innerHTML = sakla2;
    });

  fetch("http://localhost:8080/sehirGezilecekYerler/getAll/" + yeni[1])
    .then((response) => response.json())
    .then((result) => {
      sakla3 =
        sakla3 +
        ("<div class='row'><h1 style='color: black; font-size: 30px;'>GEZİLECEK YERLER</h1><div class='col-md-6'><div class='widget-item'><div class='sample-thumb'><img src='" +result[0].fotograf_gezilecek + "' alt='sehir' title='sehir' style='height: 350px;'></div><h4 class='consult-title'><b>" +result[0].baslik +"</b></h4><p>" +result[0].aciklama +"</p></div></div><div class='col-md-6'><div class='widget-item'><div class='sample-thumb'><img src='" + result[1].fotograf_gezilecek +"' alt='company' title='company' style='height: 350px;'></div><h4 class='consult-title'><b>" +result[1].baslik +"</b></h4><p>" +result[1].aciklama +"</p></div></div></div><div class='row'><div class='col-md-6'><div class='widget-item'><div class='sample-thumb'><img src='" +result[2].fotograf_gezilecek + "'alt='company' title='company' style='height: 350px;'></div><h4 class='consult-title'><b>" +result[2].baslik +"</b></h4><p>" +result[2].aciklama +"</p></div></div><div class='col-md-6'><div class='widget-item'><div class='sample-thumb'><img src='" +result[3].fotograf_gezilecek +"' alt='company' title='company' style='height: 350px;'></div><h4 class='consult-title'><b>" +result[3].baslik +"</b></h4><p>" +result[3].aciklama +"</p></div></div></div><div class='row'><div class='col-md-6'><div class='widget-item'><div class='sample-thumb'><img src='" +result[4].fotograf_gezilecek +"' alt='company' title='company' style='height: 350px;'></div><h4 class='consult-title'><b>" +result[4].baslik +"</b></h4><p>" +result[4].aciklama +"</p></div></div><div class='col-md-6'><div class='widget-item'><div class='sample-thumb'><img src='" +result[5].fotograf_gezilecek +"'  alt='company' title='company' style='height: 350px;'></div><h4 class='consult-title'><b>" +result[5].baslik +"</b></h4><p>" +result[5].aciklama +"</p></div></div></div><div class='row'><div class='col-md-6'><div class='widget-item'><div class='sample-thumb'><img src='" +result[6].fotograf_gezilecek + "'  alt='company' title='company' style='height: 350px;'></div><h4 class='consult-title'><b>" +result[6].baslik +"</b></h4><p>" +result[6].aciklama +"</p></div></div><div class='col-md-6'><div class='widget-item'><div class='sample-thumb'><img src='" +result[7].fotograf_gezilecek + "' alt='company' title='company' style='height: 350px;'></div><h4 class='consult-title'><b>" +result[7].baslik +"</b></h4><p>" + result[7].aciklama +"</p></div></div>");
      divDeger2.innerHTML = sakla3;
    });

  fetch(
    "https://hotels4.p.rapidapi.com/locations/search?query=" +
      yeni[1] +
      "&locale=en_US",
    {
      method: "GET",
      headers: {
        "x-rapidapi-host": "hotels4.p.rapidapi.com",
        "x-rapidapi-key": "e549fbec4fmsh32282e282698b95p185235jsn7ec391159b6c",
      },
    }
  )
    .then((response) => response.json())
    .then((result) => {
      var size = result.suggestions[1].entities.length;
      for (var i = 0; 3 > i; i++) {
        array.push(result.suggestions[1].entities[i].name);
        array1.push(result.suggestions[1].entities[i].latitude);
        array2.push(result.suggestions[1].entities[i].longitude);
      }
      for (var i = 0; array.length > i; i++) {
        var row = table.insertRow(1);
        var cell1 = row.insertCell(0);
        var cell2 = row.insertCell(1);
        cell1.innerHTML = array[i];
        var birlestir = array1[i] + "+" + array2[i];
        cell2.innerHTML =
          "<a href='https://www.google.com/maps/place/" +
          birlestir +
          "'>adrese git </a>";
      }
    });
};
