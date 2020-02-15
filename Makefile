



main_rule:
		javac *.java
		jar cvfm SilkRoad.jar manifest.txt *
		chmod +x SilkRoad.jar
		mv ./SilkRoad.jar /home/ealdrich/SilkRoad/source
