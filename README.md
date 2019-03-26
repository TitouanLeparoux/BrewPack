# BrewPack

## Présentation
Ce projet est une **application Android** faisant appel à une **API** afin de collecter les données. 
Cette application présente une liste de Brasseries Américaine de bière.

## Prérequis
- Avoir Android Studio
- Utilisation de GitHub

## Consignes respectées
- 2 écrans : Un écran avec une liste et une page descriptive de l'élément selectionné
- Appel à une API web : https://www.openbrewerydb.org/ J'ai convertis cette API en fichier `.json` hébergé sur GitHub : https://github.com/TitouanLeparoux/BrewPack/blob/master/API/breweries.json
- **Fonctionnalités BONUS**
  - Icone de l'application <img src="https://github.com/TitouanLeparoux/BrewPack/blob/master/app/src/main/res/mipmap-hdpi/ic_launcher_brewdog.png" width="20" /> 
  - Architecture de fichier MVC
  - Image de la liste <img src="https://github.com/TitouanLeparoux/BrewPack/blob/master/app/src/main/res/drawable/icon_beer.png" width="15" />


## Fonctionnalité

| 1er écran | 2ème écran |
|:-:|:-:|
| <img src="https://github.com/TitouanLeparoux/BrewPack/blob/master/Screenshot/Screenshot01_List.jpg" width="250" /> | <img src="https://github.com/TitouanLeparoux/BrewPack/blob/master/Screenshot/Screenshot02_Content.jpg" width="250" /> |

1. On voit la liste des différentes brasseries présentes dans la base de donnée de l'API.
2. Lorsque l'on selectionne un élement de la liste, on obtient les détails de cette brasserie comme le type de la brasserie, sa localisation et son site web.
