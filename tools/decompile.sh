#!/usr/bin/env bash
# إعادة بناء شجرة فك التجميع من APK أصلي
set -e
APK="${1:?usage: decompile.sh app.apk outdir}"
OUT="${2:-ayah-full}"
mkdir -p "$OUT"
apktool d -f -o "$OUT/apktool_out" "$APK"
jadx -d "$OUT/jadx_out" --no-res "$APK"
unzip -o "$APK" 'assets/*' -d "$OUT/assets"
echo "done: $OUT"
