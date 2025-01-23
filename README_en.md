# Redstone Structure Block

A Fabric mod that allows saving structures to disk (permanent storage) instead of memory when triggering structure blocks with redstone.

Repository: https://github.com/sch246/redstone-structure-block

## Features

- Adds a scoreboard objective `rules.redstoneSaveStructureBlock` to control structure saving behavior
- When the score is greater than 0, structures will be saved to disk instead of memory
- Works with redstone-triggered structure blocks

## Usage

1. Install the mod in your Fabric mod folder
2. The mod will automatically create a scoreboard objective `rules.redstoneSaveStructureBlock`
3. To enable saving to disk:
```
/scoreboard players set # rules.redstoneSaveStructureBlock 1
```
4. To disable (return to default memory-only saving):
```
/scoreboard players set # rules.redstoneSaveStructureBlock 0
```

## Requirements

- Fabric Loader
- Fabric API

## License

This mod is available under the MIT License.

## Contributing

Feel free to submit issues and pull requests!

## Contact

For any questions or suggestions, please contact QQ 980001119