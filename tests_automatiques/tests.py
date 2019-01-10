import shlex, subprocess, time, os

command_line = "java -jar \"whc_python.jar\" if.wh ifout.py"
args=shlex.split(command_line)
print(args)
a=subprocess.Popen(args) 

while not os.path.exists("ifout.py"):
    time.sleep(5)

command_out = "python ifout.py 3 3"
argsout = shlex.split(command_out)
b=subprocess.Popen(argsout) 








