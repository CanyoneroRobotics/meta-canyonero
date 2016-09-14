DESCRIPTION = "Canyonero Base."
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=4d92cd373abda3937c2bc47fbc49d690 \
                    file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

RDEPENDS_${PN} = "controller-interface libserial roslaunch roscpp rospy \
            tf std-msgs sensor-msgs controller-manager controller-manager-msgs hardware-interface roslint \
            teleop-twist-joy teleop-twist-keyboard twist-mux joy \
            diff-drive-controller \
            effort-controllers \
            force-torque-sensor-controller \
            forward-command-controller \
            gripper-action-controller \
            imu-sensor-controller \
            joint-state-controller \
            joint-trajectory-controller \
            position-controllers \
            velocity-controllers"

require TFM.inc
