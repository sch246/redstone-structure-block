# Redstone Structure Block

一个 Fabric 模组，允许在使用红石触发结构方块时，将结构保存到硬盘（永久存储）中，而不是内存中。

language: [English](./README_en.md)

仓库地址: https://github.com/sch246/redstone-structure-block

## 功能特性

- 添加了一个记分板目标 `rules.redstoneSaveStructureBlock` 来控制结构保存行为
- 当分数大于 0 时，结构将保存到硬盘而不是内存中
- 适用于被红石触发的结构方块

## 使用方法

1. 将模组安装到你的 Fabric 模组文件夹中
2. 模组会自动创建一个记分板目标 `rules.redstoneSaveStructureBlock`
3. 启用硬盘保存功能：
```

/scoreboard players set # rules.redstoneSaveStructureBlock 1
```
4. 禁用（恢复为默认的仅内存保存）：
```

/scoreboard players set # rules.redstoneSaveStructureBlock 0
```

## 运行要求

- Fabric Loader
- Fabric API

## 许可证

本模组采用 MIT 许可证

## 参与贡献

欢迎提交问题和拉取请求！

## 联系方式

如有任何问题或建议，请联系 QQ 980001118
