package G1;

import android.text.SpannableStringBuilder;
import io.realm.RealmFieldTypeConstants;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f2770b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f2771c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f2772d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f2773e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f2774a;

    static {
        f fVar = g.f2784c;
        f2770b = Character.toString((char) 8206);
        f2771c = Character.toString((char) 8207);
        f2772d = new b(false);
        f2773e = new b(true);
    }

    public b(boolean z10) {
        f fVar = g.f2782a;
        this.f2774a = z10;
    }

    public static int a(CharSequence charSequence) {
        byte directionality;
        a aVar = new a(charSequence);
        aVar.f2768c = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int i13 = aVar.f2768c;
            if (i13 < aVar.f2767b && i10 == 0) {
                CharSequence charSequence2 = aVar.f2766a;
                char cCharAt = charSequence2.charAt(i13);
                aVar.f2769d = cCharAt;
                if (Character.isHighSurrogate(cCharAt)) {
                    int iCodePointAt = Character.codePointAt(charSequence2, aVar.f2768c);
                    aVar.f2768c = Character.charCount(iCodePointAt) + aVar.f2768c;
                    directionality = Character.getDirectionality(iCodePointAt);
                } else {
                    aVar.f2768c++;
                    char c10 = aVar.f2769d;
                    directionality = c10 < 1792 ? a.f2765e[c10] : Character.getDirectionality(c10);
                }
                if (directionality != 0) {
                    if (directionality == 1 || directionality == 2) {
                        if (i12 == 0) {
                            return 1;
                        }
                    } else if (directionality != 9) {
                        switch (directionality) {
                            case RealmFieldTypeConstants.CORE_TYPE_VALUE_LINKING_OBJECTS /* 14 */:
                            case RealmFieldTypeConstants.CORE_TYPE_VALUE_OBJECTID /* 15 */:
                                i12++;
                                i11 = -1;
                                continue;
                            case RealmFieldTypeConstants.CORE_TYPE_VALUE_TYPED_LINK /* 16 */:
                            case 17:
                                i12++;
                                i11 = 1;
                                continue;
                            case 18:
                                i12--;
                                i11 = 0;
                                continue;
                        }
                    }
                } else if (i12 == 0) {
                    return -1;
                }
                i10 = i12;
            }
        }
        if (i10 != 0) {
            if (i11 == 0) {
                while (aVar.f2768c > 0) {
                    switch (aVar.a()) {
                        case RealmFieldTypeConstants.CORE_TYPE_VALUE_LINKING_OBJECTS /* 14 */:
                        case RealmFieldTypeConstants.CORE_TYPE_VALUE_OBJECTID /* 15 */:
                            if (i10 == i12) {
                                return -1;
                            }
                            i12--;
                            break;
                        case RealmFieldTypeConstants.CORE_TYPE_VALUE_TYPED_LINK /* 16 */:
                        case 17:
                            if (i10 == i12) {
                                return 1;
                            }
                            i12--;
                            break;
                        case 18:
                            i12++;
                            break;
                        default:
                            break;
                    }
                }
            } else {
                return i11;
            }
        }
        return 0;
    }

    public static int b(CharSequence charSequence) {
        a aVar = new a(charSequence);
        aVar.f2768c = aVar.f2767b;
        int i10 = 0;
        while (true) {
            int i11 = i10;
            while (aVar.f2768c > 0) {
                byte bA = aVar.a();
                if (bA == 0) {
                    if (i10 == 0) {
                        return -1;
                    }
                    if (i11 == 0) {
                    }
                } else if (bA == 1 || bA == 2) {
                    if (i10 == 0) {
                        return 1;
                    }
                    if (i11 == 0) {
                    }
                } else if (bA != 9) {
                    switch (bA) {
                        case RealmFieldTypeConstants.CORE_TYPE_VALUE_LINKING_OBJECTS /* 14 */:
                        case RealmFieldTypeConstants.CORE_TYPE_VALUE_OBJECTID /* 15 */:
                            if (i11 == i10) {
                                return -1;
                            }
                            i10--;
                            break;
                        case RealmFieldTypeConstants.CORE_TYPE_VALUE_TYPED_LINK /* 16 */:
                        case 17:
                            if (i11 == i10) {
                                return 1;
                            }
                            i10--;
                            break;
                        case 18:
                            i10++;
                            break;
                        default:
                            if (i11 != 0) {
                            }
                            break;
                    }
                } else {
                    continue;
                }
            }
            return 0;
        }
    }

    public final SpannableStringBuilder c(CharSequence charSequence) {
        String str;
        f fVar = g.f2784c;
        if (charSequence == null) {
            return null;
        }
        boolean zD = fVar.d(charSequence, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        boolean zD2 = (zD ? g.f2783b : g.f2782a).d(charSequence, charSequence.length());
        String str2 = "";
        String str3 = f2771c;
        String str4 = f2770b;
        boolean z10 = this.f2774a;
        if (z10 || !(zD2 || a(charSequence) == 1)) {
            str = (!z10 || (zD2 && a(charSequence) != -1)) ? "" : str3;
        } else {
            str = str4;
        }
        spannableStringBuilder.append((CharSequence) str);
        if (zD != z10) {
            spannableStringBuilder.append(zD ? (char) 8235 : (char) 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        boolean zD3 = (zD ? g.f2783b : g.f2782a).d(charSequence, charSequence.length());
        if (!z10 && (zD3 || b(charSequence) == 1)) {
            str2 = str4;
        } else if (z10 && (!zD3 || b(charSequence) == -1)) {
            str2 = str3;
        }
        spannableStringBuilder.append((CharSequence) str2);
        return spannableStringBuilder;
    }
}
