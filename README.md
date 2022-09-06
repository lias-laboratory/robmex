# ROBMEX

This page is dedicated to describe the RoBMEX modelling framework, its dependencies, download and use.

## Description

A modelling framework to ease the conception of drone missions using ROS. The framework, still under development, is based on Ecore (Eclipse) and is able to generate models and code for drone missions as ROS systems.

## Dependencies

To generate instances and code: 

* [Eclipse Modelling package](https://www.eclipse.org/downloads/packages/release/2020-09/r/eclipse-modeling-tools)
* [Acceleo](https://wiki.eclipse.org/Acceleo/Installation)

To execute: 

* [ROS](https://www.ros.org/)

## Download

The RoBMEX modelling framework can be downloaded at /projects/robmex/files. 

## Install

Once downloaded, the projects can be imported to the workspace by: 

* Clicking on the _File_ menu

* Selecting _Import_

* Selecting _Existing Projects into Workspace_, from the _General_ folder

* Selecting the _Select archive file_ option

* Clicking on _Browse..._ and finding the downloaded zip file

* Making sure all of the four projects are selected for importation

## Create instances

With the Modelling perspective: 

* Go to the desired project in the Model Explorer

* In the respective project, open the folder called _model_ and double-click the _.ecore_ file

* Expand the items until there is visible:
  * _Mission_, for ROSMiLan

  * _RosPackage_, for ROSModL

  * _Functionality_, for ROSProML (_processMaker.ecore_)

* Right-click the item and click on _Create Dynamic Instance_

* Choose a filename and a folder for the instance file (_.xmi_)

* Expand the items and, for adding elements, right-click the instance, go to _New Child_ and select the desired element

* Their attributes can be seen and edited in the Properties tab, normally bellow the screen

## Generate code

* Select the desired *.mtl* code in the *SourceCodeGenerator* project, in the *src* folder, in the project ending with *.common*

* Click on the arrow next to the **Run** button (green, on top of the screen), and select **Run Configurations**

* Set the Model as the *.xmi* file representing the instance that will have its code automatically generated

* Choose a target folder

* Run

## Contributors

* [Matheus LADEIRA](https://www.lias-lab.fr/fr/members/matheusladeira/)
* [Yassine OUHAMMOU](https://www.lias-lab.fr/fr/members/yassineouhammou/)
* [Emmanuel GROLLEAU](https://www.lias-lab.fr/fr/members/emmanuelgrolleau/)