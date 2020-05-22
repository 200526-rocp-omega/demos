# Author: Matthew Oberlies
# Description: This is a Powershell Script to help quickly setup a development environment for a batch at Revature.
#              This script leverages Scoop, and it will install packages to C:/Users/username/scoop/
#              as well as modify environment variables in order to install applications.
#              Note that some packages (namely Java and STS) occasionally are unable to cleanly un-install
#              and may require manual deletion of some files or environment variables in the future.

# This command will ignore errors that might occur such as a package already being installed
# Without this command, re-running the script multiple times will not work
$ErrorActionPreference = 'Continue'

# Note: You must run the following command manually (as administrator) before powershell scripts may be run
# Set-ExecutionPolicy Unrestricted -scope CurrentUser
# Choose Yes to All when prompted

# If you want to remove scoop and its apps, you can use 'scoop uninstall scoop'

# The below block will ask to launch the script in administrator mode if not already
If (-NOT ([Security.Principal.WindowsPrincipal][Security.Principal.WindowsIdentity]::GetCurrent()).IsInRole([Security.Principal.WindowsBuiltInRole] "Administrator"))
{
  $arguments = "& '" + $myinvocation.mycommand.definition + "'"
  Start-Process powershell -Verb runAs -ArgumentList $arguments
  Break
}

# This command will download and install Scoop
# Adds the following to the PATH User Environment variable:  C:\Users\username\scoop\shims
iwr -useb get.scoop.sh | iex

# Install git-bash and git-gui (No context menu is created)
# This is required for scoop to function
scoop install git

# This adds support for extra repositories for more packages
scoop bucket add extras

# Install JDK 8
scoop bucket add java
scoop install adopt8-upstream

# install needed packages
scoop install maven tomcat sts
