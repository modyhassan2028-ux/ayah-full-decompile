package p009aa;

import E2.C0124h;
import U6.C0532j;
import W9.c;
import W9.e;
import W9.f;
import W9.h;
import Z9.g;
import android.support.v4.media.session.p;
import java.lang.annotation.Annotation;
import p050e8.b;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f11243a = new j();

    public static final g a(Number number, String str) {
        return new g("Unexpected special floating-point value " + number + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + ((Object) g(str, -1)));
    }

    public static final g b(String str, CharSequence charSequence, int i10) {
        j.e(str, "message");
        j.e(charSequence, "input");
        String str2 = str + "\nJSON input: " + ((Object) g(charSequence, i10));
        j.e(str2, "message");
        if (i10 >= 0) {
            str2 = "Unexpected JSON token at offset " + i10 + ": " + str2;
        }
        j.e(str2, "message");
        return new g(str2);
    }

    public static final f c(f fVar, C0532j c0532j) {
        j.e(fVar, "<this>");
        j.e(c0532j, "module");
        if (!j.a(fVar.c(), h.f9677c)) {
            return fVar.f() ? c(fVar.j(0), c0532j) : fVar;
        }
        b.u(fVar);
        return fVar;
    }

    public static final byte d(char c10) {
        if (c10 < '~') {
            return c.f11236b[c10];
        }
        return (byte) 0;
    }

    public static final String e(f fVar, Z9.b bVar) {
        j.e(fVar, "<this>");
        j.e(bVar, "json");
        for (Annotation annotation : fVar.getAnnotations()) {
            if (annotation instanceof g) {
                return ((g) annotation).discriminator();
            }
        }
        return (String) bVar.f11043a.f3466e;
    }

    public static final void f(C0124h c0124h, String str) {
        c0124h.o(c0124h.f1673b - 1, "Trailing comma before the end of JSON ".concat(str), "Trailing commas are non-complaint JSON and not allowed by default. Use 'allowTrailingCommas = true' in 'Json {}' builder to support them.");
        throw null;
    }

    public static final CharSequence g(CharSequence charSequence, int i10) {
        j.e(charSequence, "<this>");
        if (charSequence.length() >= 200) {
            if (i10 != -1) {
                int i11 = i10 - 30;
                int i12 = i10 + 30;
                String str = i11 <= 0 ? "" : ".....";
                String str2 = i12 >= charSequence.length() ? "" : ".....";
                StringBuilder sbC = p.C(str);
                if (i11 < 0) {
                    i11 = 0;
                }
                int length = charSequence.length();
                if (i12 > length) {
                    i12 = length;
                }
                sbC.append(charSequence.subSequence(i11, i12).toString());
                sbC.append(str2);
                return sbC.toString();
            }
            int length2 = charSequence.length() - 60;
            if (length2 > 0) {
                return "....." + charSequence.subSequence(length2, charSequence.length()).toString();
            }
        }
        return charSequence;
    }

    public static final void h(f fVar, Z9.b bVar) {
        j.e(fVar, "<this>");
        j.e(bVar, "json");
        if (j.a(fVar.c(), W9.i.f9679c)) {
            bVar.f11043a.getClass();
        }
    }

    public static final q i(f fVar, Z9.b bVar) {
        j.e(fVar, "desc");
        va.g gVarC = fVar.c();
        if (gVarC instanceof c) {
            return q.POLY_OBJ;
        }
        if (j.a(gVarC, W9.i.f9680d)) {
            return q.LIST;
        }
        if (!j.a(gVarC, W9.i.f9681e)) {
            return q.OBJ;
        }
        f fVarC = c(fVar.j(0), bVar.f11044b);
        va.g gVarC2 = fVarC.c();
        if ((gVarC2 instanceof e) || j.a(gVarC2, h.f9678d)) {
            return q.MAP;
        }
        bVar.f11043a.getClass();
        throw new g("Value of type '" + fVarC.b() + "' can't be used in JSON as a key in the map. It should have either primitive or enum kind, but its kind is '" + fVarC.c() + "'.\nUse 'allowStructuredMapKeys = true' in 'Json {}' builder to convert such maps to [key1, value1, key2, value2,...] arrays.");
    }

    public static final void j(C0124h c0124h, Number number) {
        C0124h.p(c0124h, "Unexpected special floating-point value " + number + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification", 0, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", 2);
        throw null;
    }

    public static final String k(byte b5) {
        if (b5 == 1) {
            return "quotation mark '\"'";
        }
        if (b5 == 2) {
            return "string escape sequence '\\'";
        }
        if (b5 == 4) {
            return "comma ','";
        }
        if (b5 == 5) {
            return "colon ':'";
        }
        if (b5 == 6) {
            return "start of the object '{'";
        }
        if (b5 == 7) {
            return "end of the object '}'";
        }
        if (b5 == 8) {
            return "start of the array '['";
        }
        if (b5 == 9) {
            return "end of the array ']'";
        }
        if (b5 == 10) {
            return "end of the input";
        }
        return b5 == 127 ? "invalid token" : "valid token";
    }
}
