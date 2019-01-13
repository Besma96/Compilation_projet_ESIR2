import time, os,shlex, datetime,shlex, subprocess, sys

#L = []
i = sys.argv[1]
	
command_out = "python3 profondeur_out.py "+ str(i)
begin =time.time()
subprocess.Popen(shlex.split(command_out))
duration = time.time() - begin
#L.append(duration)
print("durees pour ",i," : ", duration)
