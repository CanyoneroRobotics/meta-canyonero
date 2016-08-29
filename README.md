This layer provides a Poky image for the Canyonero rover on-board Raspberry Pi 3 computer.

## Dependencies ##

  This layer depends on:

  **Yocto**  
  
  URI: git://git.yoctoproject.org/poky
  
  branch: jethro
  
  **OpenEmbedded**
  
  URI: git://git.openembedded.org/meta-openembedded
  
  branch: jethro

  **meta-raspberrypi**  
  
  URI: git://git.yoctoproject.org/meta-raspberrypi
  
  branch: master

  **meta-ros**
  
  URI: https://github.com/bmwcarit/meta-ros.git
  
  branch: master
  
  **meta-maker**
  
  URI: git://git.yoctoproject.org/meta-maker
  
  branch: master
  
## BB layers ##
Modify your ./conf/bblayers.conf as below:
```
BBLAYERS ?= " \
  /your/working/path/poky/meta \
  /your/working/path/poky/meta-yocto \
  /your/working/path/poky/meta-yocto-bsp \
  /your/working/path/poky/meta-raspberrypi \
  /your/working/path/poky/meta-ros \
  /your/working/path/poky/meta-canyonero \
  /your/working/path/poky/meta-maker \
  /your/working/path/poky/oe-core/meta-networking \
  /your/working/path/poky/oe-core/meta-oe \
  /your/working/path/poky/oe-core/meta-perl \
  /your/working/path/poky/oe-core/meta-python \
  "
BBLAYERS_NON_REMOVABLE ?= " \
  /your/working/path/poky/meta \
  /your/working/path/poky/meta-yocto \
  "
```
  
## Bitbake details ##
```
Build Configuration:
BB_VERSION        = "1.28.0"
BUILD_SYS         = "x86_64-linux"
NATIVELSBSTRING   = "Ubuntu-14.04"
TARGET_SYS        = "arm-poky-linux-gnueabi"
MACHINE           = "raspberrypi3"
DISTRO            = "poky"
DISTRO_VERSION    = "2.0.2"
TUNE_FEATURES     = "arm armv7a vfp thumb neon callconvention-hard vfpv4 cortexa7"
TARGET_FPU        = "vfp-vfpv4-neon"
meta              
meta-yocto        
meta-yocto-bsp    = "jethro:40376446904ae3529be41737fed9a0b650ed167d"
meta-raspberrypi  = "master:2745399f75d7564fcc586d0365ff73be47849d0e"
meta-ros          = "master:ebd3b9b1a442e23bf79afd2240b5f6ea883a60a8"
meta-canyonero    = "master:43f175ad1729713f2a9835da9dc039604e929b4d"
meta-maker        = "master:c039fafa7a0276769d0928d16bdacd2012f2aff6"
meta-networking   
meta-oe           
meta-perl         
meta-python       = "jethro:8ab04afbffb4bc5184cfe0655049de6f44269990"
```
