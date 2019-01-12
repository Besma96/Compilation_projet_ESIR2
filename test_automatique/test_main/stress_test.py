import time, os,shlex, datetime,shlex, subprocess

begin =datetime.datetime.now()
command_out = "python profondeur_out.py 100"
subprocess.Popen(shlex.split(command_out))
duration = datetime.datetime.now() - begin
print("duree", duration)