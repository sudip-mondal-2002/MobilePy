import sys
from os.path import dirname, join
from com.chaquo.python import Python

def main(CodeAreaData,inputText):
    file_dir = str(Python.getPlatform().getApplication().getFilesDir())
    inputs = inputText.split("\n")
    def input(prompt=None):
        temp = inputs.pop(0)
        return temp

    filename = join(dirname(file_dir), 'file.txt')
    try:
        original_stdout = sys.stdout
        sys.stdout = open(filename,'w',encoding='utf8', errors="ignore")
        exec (CodeAreaData)
        sys.stdout.close()

        sys.stdout = original_stdout

        output = open(filename, "r").read()
    except Exception as e:
        sys.stdout = original_stdout
        output = e

    return output