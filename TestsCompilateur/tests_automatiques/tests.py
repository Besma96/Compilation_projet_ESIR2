import shlex, subprocess, time, os

###############
### test if ###
###############
command_line = "java -jar \"whc_python.jar\" if.wh ifout.py"
args=shlex.split(command_line)
print(args)
a=subprocess.Popen(args) 

while not os.path.exists("ifout.py"):
    time.sleep(5)

command_out = "python ifout.py 3 3"
argsout = shlex.split(command_out)
b=subprocess.Popen(argsout) 

################
### test for ###
################
command_line = "java -jar \"whc_python.jar\" for.wh forout.py"
args=shlex.split(command_line)
print(args)
a=subprocess.Popen(args) 

while not os.path.exists("forout.py"):
    time.sleep(5)

command_out = "python forout.py 3"
argsout = shlex.split(command_out)
b=subprocess.Popen(argsout) 

#########################
### test aff multiple ###
#########################

command_line = "java -jar \"whc_python.jar\" affmultp.wh affmultpout.py"
args=shlex.split(command_line)
print(args)
a=subprocess.Popen(args) 

while not os.path.exists("affmultpout.py"):
    time.sleep(5)

command_out = "python affmultpout.py 3 1"
argsout = shlex.split(command_out)
b=subprocess.Popen(argsout) 


################
### test nop ###
################

command_line = "java -jar \"whc_python.jar\" nop.wh nopout.py"
args=shlex.split(command_line)
print(args)
a=subprocess.Popen(args) 

while not os.path.exists("nopout.py"):
    time.sleep(5)

command_out = "python nopout.py 1"
argsout = shlex.split(command_out)
b=subprocess.Popen(argsout)


##################
### test while ###
##################

command_line = "java -jar \"whc_python.jar\" while.wh whileout.py"
args=shlex.split(command_line)
print(args)
a=subprocess.Popen(args) 

while not os.path.exists("whileout.py"):
    time.sleep(5)

command_out = "python whileout.py 5"
argsout = shlex.split(command_out)
b=subprocess.Popen(argsout) 