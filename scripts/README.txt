TIPS FOR USING THESE SCRIPTS:

BlockAPINames.txt
-----------------
Fill out rows in a spreadsheet editor (such as Google Sheets) with the information on the blocks you want to add.
Each row in the sheet should dictate a specific block's information.
Each column of each row will hold a different value of the block's information in the following order:
{BLOCK_API_NAME}	{BLOCK_DISPLAY_NAME}	{MATERIAL}	{MATERIAL_COLOR}	{HARDNESS}	{RESISTANCE}

An example would look like this:
test_block		Test Block		ROCK		STONE			1.5F		6.0F

Once you have your rows typed out, copy and paste all the rows into BlockAPINames.txt. If done correctly, it should look
like the above line, separated by tabs. The tab separation is VERY IMPORTANT because many of the scripts use the tab
separation as a string delimiter, so we can access each value of the row separately for different purposes.




GenerateBlockModels.ps1
-----------------------
Running this script will use BlockAPINames.txt to generate .json block model files in Output/models/blocks. You can
then copy the files generated into your source code.



GenerateBlockRegistry.ps1
-------------------------
Running this script will add a line of Java code that instantiates and registers a custom block to 
Output/BlockRegistryAddon.txt for each custom block defined in BlockAPINames.txt. You can then copy and paste the
contents of Output/BlockRegistryAddon.txt to the location in your source code that you wish to instantiate your
custom blocks. Make sure the location you paste to has a 'register(String, Block)' custom method declared in it 
that adds the custom block to a list of blocks for later registry.



GenerateBlockstates.ps1
-----------------------
Running this script will use BlockAPINames.txt to generate .json blockstate files in Output/blockstates. You can
then copy the files generated into your source code.



GenerateItemModels.ps1
----------------------
Running this script will use BlockAPINames.txt to generate .json item model files for your blocks in Output/models/items. You can
then copy the files generated into your source code.



GenerateLange.ps1
-----------------
Running this script will add a line of JSON that declares a display name for your custom blocks as dictated in BlockAPINames.txt
to the Output/LangAddon.txt file. You can then copy the contents of Output/LangAddon.txt to your en_us.json file in your
source code. Each line has a comma at the end of it, so make sure to remove the comma on the last line.



GenerateStonecutterRecipes.ps1
------------------------------
Running this script will generate .json recipe files that will add recipes to the Stonecutter block, giving you access to whatever
combination of custom blocks and vanilla blocks you desire. WIP.