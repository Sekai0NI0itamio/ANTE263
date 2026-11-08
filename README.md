# Anvil Never Too Expensive — Modern Port for Minecraft 26.3 (Fabric)

![Mod loader: Fabric](https://img.shields.io/badge/modloader-Fabric-1976d2?style=for-the-badge)
![Minecraft: 26.3](https://img.shields.io/badge/Minecraft-26.3-green?style=for-the-badge)
![GitHub license](https://img.shields.io/github/license/Sekai0NI0itamio/ANTE263?style=for-the-badge)

**Removes the anvil "Too Expensive!" cap — repair, rename, or enchant anything you can afford.**

Ever had to let a perfectly enchanted pickaxe break because the game
decided you weren't allowed to use your hard-earned levels on repairing
it? Anvil Never Too Expensive removes that level cap entirely. No
longer will perfectly fine equipment go to waste because the game
limits your possibilities!

Now with a **modern port for Minecraft 26.3 (Fabric)**.

### What it does

- Removes the level cap when repairing/renaming/enchanting at an anvil
- Extremely lightweight, no incompatibilities expected
- Does not enable cheating — the interaction still costs levels
- Recommended on both server & client, technically only needed server-side

### Modern port notes (26.3)

- Same two-constant mixin as the original (`AnvilMenu.createResult` 40/39)
- Java 25 · Fabric Loader 0.20.1+ · Fabric API 0.165.0+26.3
- Built and verified in CI via GitHub Actions, including a headless
  runtime test that launches the client, joins a world, and quits cleanly

### Installation

1. Install Fabric Loader for Minecraft 26.3
2. Install Fabric API
3. Drop `ante263-*.jar` into your `mods` folder

### Original mod & credit

This is an unofficial modern port by **Itamio** of **Anvil Never Too
Expensive** by **tinytransfem** — the original (1.9M downloads on
Modrinth, last updated for 1.21.11) has not been updated to 26.3.

- Original mod: https://modrinth.com/mod/ante
- Original source: https://github.com/tinytransfem/AnvilNeverTooExpensive
- License: GPL-3.0-only — see `LICENSE`

All credit for the original concept, design, and logic goes to
tinytransfem. This port exists to bring it to Minecraft 26.3. See `NOTICE`.
