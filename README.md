# com.ayah (Ayah) v7.8.2 — فك تجميع كامل

هذا المستودع يحتوي على **كل ما يمكن استخراجه** من APK التطبيق الأصلي `com.ayah` الإصدار 7.8.2،
بالأدوات المفتوحة المصدر. الأصل تطبيق **أندرويد أصلي (Kotlin + Jetpack Compose + Realm + Room)**،
**وليس Flutter** (لا يوجد `libapp.so` داخل الـAPK).

## المحتويات

| المسار | المحتوى |
|---|---|
| `java-sources/com/ayah/` | **138 كلاس من كود التطبيق نفسه** (jadx: من classes.dex و classes2.dex) |
| `java-sources/com/google/` | مكتبات Admob/Play المضمّنة |
| `java-sources/com/squareup/` | مكتبات OkHttp/Room/Moshi المضمّنة |
| `resources/` | موارد apktool: `layout` (170 ملفًا) · `values` · `values-ar` (520 نصًا) · `drawable` · `color` · `font` · `menu` · `xml` · `mipmap` |
| `AndroidManifest.xml` | المانيفست بعد فك الترميز (كل الأنشطة والصلاحيات والـproviders) |
| `assets/databases/` | `ar-mokhtasar.db` (تفسير+خريطة صفحات) · `en-saheeh.db` · `quran-text.db` |
| `assets/realm/` | `quran.realm` (7.4MB) · `audio.realm` (4.3MB: 40 قارئًا × 114 سورة بمساراتها) |
| `assets/quran-images.zip` | **9060 صورة صفحة مصحف** (604 صفحة × 15 سطرًا) — نفس تقسيم التطبيق |
| `assets/fonts/` | `hafs_smart_08.ttf` · `quran_numbers.ttf` · `quran_titles.ttf` |
| `assets/*.json` | بيانات مساعدة مستخرجة (السور، القراء) |

## أوامر إعادة الإنتاج

```bash
# 1) الموارد + المانيفست
apktool d -f -o apktool_out ayah.apk

# 2) كود جافا (dex → Java) لـ 7935 ملفًا منها 138 كلاسًا للتطبيق
jadx -d jadx_out --no-res ayah.apk

# 3) الأصول
unzip ayah.apk 'assets/*' -d assets

# 4) الصور مسطّحة لأن Flutter/أدوات أخرى لا تضمّن المجلدات الفرعية
```

## حدود ما يمكن استرجاعه

- كود Kotlin يُستخرج إلى **Java مكافئ** بواسطة jadx: منطق الأصناف كامل، لكن أسماء المتغيرات
  وأنماط Kotlin (data classes, coroutines) تظهر بصيغة Java، ولا يعود الملف `.kt` الأصلي.
- لا توجد تعليقات ولا أسماء حزم داخلية أصلية إن كانت مشوّشة (هنا أغلب الأسماء سليمة).
- `lib/` تحتوي فقط على `librealm-jni.so` و`libdatastore_shared_counter.so` و`libandroidx.graphics.path.so`
  — كل الكود في الـdex، أي **لا يوجد سورس Dart مخفي**.
