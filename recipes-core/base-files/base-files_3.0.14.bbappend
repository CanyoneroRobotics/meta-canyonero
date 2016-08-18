# Set hostname to circutor and add banner in telnet and terminal connections

# look for files in this layer first
FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

# set hostname
hostname = "canyonero"

SRC_URI += "\
           file://issue \
           file://issue.net \
           "
