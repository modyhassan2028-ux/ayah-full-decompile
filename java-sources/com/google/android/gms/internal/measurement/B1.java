package com.google.android.gms.internal.measurement;

import H0.InterfaceC0219s;
import K9.InterfaceC0402u;
import Z.C0672b;
import Z.C0690k;
import Z.C0698o;
import Z.C0699o0;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.ayah.R;
import com.ayah.common.data.source.json.model.booklist.BookType;
import com.ayah.dao.realm.model.quran.Chapter;
import com.ayah.dao.realm.model.quran.ChapterHeader;
import com.ayah.dao.realm.model.quran.Page;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.nio.channels.Channel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p151p.C1256n;
import p224x0.C1441e;
import p224x0.C1442f;

/* JADX INFO: loaded from: classes.dex */
public abstract class B1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static p213v8.b f13995a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static C1442f f13996b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static C1442f f13997c;

    public static final C1442f A() {
        C1442f c1442f = f13996b;
        if (c1442f != null) {
            return c1442f;
        }
        C1441e c1441e = new C1441e("AutoMirrored.Filled.ArrowBack", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, true, 96);
        int i10 = p224x0.G.f24154a;
        p180s0.L l10 = new p180s0.L(p180s0.q.f21839b);
        C1256n c1256n = new C1256n(13);
        ArrayList arrayList = (ArrayList) c1256n.f20747s;
        c1256n.j(20.0f, 11.0f);
        arrayList.add(new p224x0.l(7.83f));
        c1256n.f(5.59f, -5.59f);
        c1256n.e(12.0f, 4.0f);
        c1256n.f(-8.0f, 8.0f);
        c1256n.f(8.0f, 8.0f);
        c1256n.f(1.41f, -1.41f);
        c1256n.e(7.83f, 13.0f);
        arrayList.add(new p224x0.l(20.0f));
        c1256n.o(-2.0f);
        c1256n.a();
        C1441e.a(c1441e, arrayList, l10);
        C1442f c1442fB = c1441e.b();
        f13996b = c1442fB;
        return c1442fB;
    }

    public static final A1.c B(I1.B0 b5, int i10) {
        A1.c cVarG = b5.f3671a.g(i10);
        p251z9.j.d(cVarG, "{\n        getInsets(typeMask)\n    }");
        return cVarG;
    }

    public static final U9.a C(U9.a aVar) {
        p251z9.j.e(aVar, "<this>");
        return aVar.d().h() ? aVar : new Y9.K(aVar);
    }

    public static Object D(String str, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 34) {
            return E1.a.b(str, bundle);
        }
        Parcelable parcelable = bundle.getParcelable(str);
        if (p053f.a.class.isInstance(parcelable)) {
            return parcelable;
        }
        return null;
    }

    public static final BookType E(Context context) {
        String string = context.getString(R.string.quran_text);
        p251z9.j.d(string, "getString(...)");
        String string2 = context.getString(R.string.quran_subtitle);
        p251z9.j.d(string2, "getString(...)");
        return new BookType("quran-text", "", string, string2, false, false, null, 32, null);
    }

    public static Class F(Type type) {
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            return (Class) ((ParameterizedType) type).getRawType();
        }
        if (type instanceof GenericArrayType) {
            return Array.newInstance((Class<?>) F(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        }
        if (type instanceof TypeVariable) {
            return Object.class;
        }
        if (type instanceof WildcardType) {
            return F(((WildcardType) type).getUpperBounds()[0]);
        }
        throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + (type == null ? "null" : type.getClass().getName()));
    }

    public static V8.b G(Type... typeArr) {
        if (typeArr.length != 0) {
            return new V8.b(null, List.class, typeArr);
        }
        throw new IllegalArgumentException("Missing type arguments for " + List.class);
    }

    public static void I(Drawable drawable, int i10) {
        drawable.setTint(i10);
    }

    public static final p110k9.r L(String str) {
        int i10;
        F9.n.n(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i11 = 0;
        char cCharAt = str.charAt(0);
        if (p251z9.j.f(cCharAt, 48) < 0) {
            i10 = 1;
            if (length == 1 || cCharAt != '+') {
                return null;
            }
        } else {
            i10 = 0;
        }
        int i12 = 119304647;
        while (i10 < length) {
            int iDigit = Character.digit((int) str.charAt(i10), 10);
            if (iDigit < 0) {
                return null;
            }
            int i13 = i11 ^ Integer.MIN_VALUE;
            if (Integer.compare(i13, i12 ^ Integer.MIN_VALUE) > 0) {
                if (i12 != 119304647) {
                    return null;
                }
                i12 = (int) ((((long) (-1)) & 4294967295L) / (4294967295L & ((long) 10)));
                if (Integer.compare(i13, i12 ^ Integer.MIN_VALUE) > 0) {
                    return null;
                }
            }
            int i14 = i11 * 10;
            int i15 = iDigit + i14;
            if (Integer.compare(i15 ^ Integer.MIN_VALUE, i14 ^ Integer.MIN_VALUE) < 0) {
                return null;
            }
            i10++;
            i11 = i15;
        }
        return new p110k9.r(i11);
    }

    public static final p110k9.t M(String str) {
        int i10;
        p251z9.j.e(str, "<this>");
        int i11 = 10;
        F9.n.n(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        char cCharAt = str.charAt(0);
        int i12 = 1;
        if (p251z9.j.f(cCharAt, 48) >= 0) {
            i10 = 0;
        } else {
            if (length == 1 || cCharAt != '+') {
                return null;
            }
            i10 = 1;
        }
        long j = 10;
        long j10 = 0;
        long j11 = 512409557603043100L;
        while (i10 < length) {
            int iDigit = Character.digit((int) str.charAt(i10), i11);
            if (iDigit < 0) {
                return null;
            }
            int i13 = length;
            long j12 = j10 ^ Long.MIN_VALUE;
            int i14 = i10;
            if (Long.compare(j12, j11 ^ Long.MIN_VALUE) <= 0) {
                j = j;
            } else {
                if (j11 != 512409557603043100L) {
                    return null;
                }
                if (j < 0) {
                    j11 = Long.MAX_VALUE < (j ^ Long.MIN_VALUE) ? 0L : 1L;
                } else {
                    long j13 = (Long.MAX_VALUE / j) << i12;
                    j11 = j13 + ((long) ((((-1) - (j13 * j)) ^ Long.MIN_VALUE) >= (j ^ Long.MIN_VALUE) ? i12 : 0));
                }
                if (Long.compare(j12, j11 ^ Long.MIN_VALUE) > 0) {
                    return null;
                }
            }
            long j14 = j10 * j;
            long j15 = (((long) iDigit) & 4294967295L) + j14;
            if (Long.compare(j15 ^ Long.MIN_VALUE, j14 ^ Long.MIN_VALUE) < 0) {
                return null;
            }
            i10 = i14 + 1;
            j10 = j15;
            length = i13;
            j = j;
            i11 = 10;
            i12 = 1;
        }
        return new p110k9.t(j10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Drawable N(Drawable drawable) {
        if (!(drawable instanceof B1.c)) {
            return drawable;
        }
        ((B1.d) ((B1.c) drawable)).getClass();
        return null;
    }

    public static final p171r0.e O(InterfaceC0219s interfaceC0219s) {
        p171r0.e eVarC = H0.a0.c(interfaceC0219s);
        float f3 = eVarC.f21389a;
        return p171r0.f.c(interfaceC0219s.f((((long) Float.floatToRawIntBits(eVarC.f21390b)) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32)), interfaceC0219s.f((((long) Float.floatToRawIntBits(eVarC.f21391c)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(eVarC.f21392d)))));
    }

    public static int Q(int i10) {
        int[] iArr = {1, 2, 3};
        for (int i11 = 0; i11 < 3; i11++) {
            int i12 = iArr[i11];
            int i13 = i12 - 1;
            if (i12 == 0) {
                throw null;
            }
            if (i13 == i10) {
                return i12;
            }
        }
        return 1;
    }

    public static synchronized void R(p213v8.b bVar) {
        if (f13995a != null) {
            throw new IllegalStateException("init() already called");
        }
        f13995a = bVar;
    }

    public static final p063g1.e a(Context context) {
        float f3 = context.getResources().getConfiguration().fontScale;
        float f7 = context.getResources().getDisplayMetrics().density;
        p075h1.a aVarA = p075h1.b.a(f3);
        if (aVarA == null) {
            aVarA = new p063g1.n(f3);
        }
        return new p063g1.e(f7, f3, aVarA);
    }

    public static final void b(N9.U u8, H2.j jVar, p241y9.e eVar, p241y9.e eVar2, C0698o c0698o, int i10) {
        List list;
        C0698o c0698o2 = c0698o;
        p251z9.j.e(eVar, "onSuraClicked");
        p251z9.j.e(eVar2, "onAyahClicked");
        c0698o2.V(888381066);
        int i11 = i10 | (c0698o2.i(u8) ? 4 : 2) | (c0698o2.i(jVar) ? 32 : 16) | (c0698o2.i(eVar) ? 256 : 128) | (c0698o2.i(eVar2) ? 2048 : 1024);
        if (c0698o2.K(i11 & 1, (i11 & 1171) != 1170)) {
            p120l9.r rVar = p120l9.r.f19440r;
            Z.X xK = C0672b.k(u8, rVar, null, c0698o2, (i11 & 14) | 48, 2);
            Z.X xK2 = C0672b.k(jVar, rVar, null, c0698o, ((i11 >> 3) & 14) | 48, 2);
            F.A a9 = F.D.a(c0698o);
            Object objH = c0698o.H();
            Z.S s10 = C0690k.f10683a;
            if (objH == s10) {
                objH = C0672b.m(c0698o);
                c0698o.e0(objH);
            }
            InterfaceC0402u interfaceC0402u = (InterfaceC0402u) objH;
            List list2 = (List) xK2.getValue();
            String[] stringArray = ((Context) c0698o.k(AndroidCompositionLocals_androidKt.f12063b)).getResources().getStringArray(R.array.sura_names);
            p251z9.j.d(stringArray, "getStringArray(...)");
            W.C1.a(null, null, ((p005a4.a) c0698o.k(p005a4.e.f11187a)).a(), 0L, 0.0f, 0.0f, null, p074h0.j.d(1306403919, new H4.e(a9, xK, stringArray, list2, p125m4.b.f19615b, eVar, eVar2), c0698o), c0698o, 12582912, 123);
            c0698o2 = c0698o;
            boolean zI = c0698o2.i(interfaceC0402u) | c0698o2.i(list2) | c0698o2.g(a9);
            Object objH2 = c0698o2.H();
            if (zI || objH2 == s10) {
                list = list2;
                A4.l lVar = new A4.l(interfaceC0402u, list, a9, null, 5);
                c0698o2.e0(lVar);
                objH2 = lVar;
            } else {
                list = list2;
            }
            C0672b.f(c0698o2, list, (p241y9.e) objH2);
        } else {
            c0698o2.N();
        }
        C0699o0 c0699o0R = c0698o2.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new M4.a(u8, jVar, eVar, eVar2, i10, 0);
        }
    }

    public static final void c(int i10, int i11, C0698o c0698o) {
        C0698o c0698o2;
        c0698o.V(889563841);
        int i12 = (c0698o.e(i10) ? 4 : 2) | i11;
        int i13 = 0;
        if (c0698o.K(i12 & 1, (i12 & 3) != 2)) {
            c0698o2 = c0698o;
            p015b4.f.h(p000a.a.n0(R.string.part, new Object[]{Integer.valueOf(i10)}, c0698o), androidx.compose.foundation.layout.b.j(l0.o.f19333a, 16, 0.0f, 2), 0L, c0698o2, 48, 4);
        } else {
            c0698o2 = c0698o;
            c0698o2.N();
        }
        C0699o0 c0699o0R = c0698o2.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new N4.a(i10, i11, i13);
        }
    }

    public static final void d(int i10, C0698o c0698o) {
        c0698o.V(1375746903);
        if (c0698o.K(i10 & 1, i10 != 0)) {
            p015b4.f.j(R.string.khatmah, 0, c0698o);
        } else {
            c0698o.N();
        }
        C0699o0 c0699o0R = c0698o.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new D4.j(i10);
        }
    }

    public static final int e(float[] fArr) {
        int i10 = 0;
        if (fArr.length < 16) {
            return 0;
        }
        int i11 = (fArr[0] == 1.0f && fArr[1] == 0.0f && fArr[2] == 0.0f && fArr[4] == 0.0f && fArr[5] == 1.0f && fArr[6] == 0.0f && fArr[8] == 0.0f && fArr[9] == 0.0f && fArr[10] == 1.0f) ? 1 : 0;
        if (fArr[12] == 0.0f && fArr[13] == 0.0f && fArr[14] == 0.0f && fArr[15] == 1.0f) {
            i10 = 1;
        }
        return (i11 << 1) | i10;
    }

    public static final void f(p009aa.n nVar) {
        p251z9.j.e(nVar, "<this>");
        if ((nVar instanceof p009aa.n ? nVar : null) != null) {
            return;
        }
        throw new IllegalStateException("This serializer can be used only with Json format.Expected Encoder to be JsonEncoder, got " + p251z9.w.a(nVar.getClass()));
    }

    public static final p009aa.m g(X9.b bVar) {
        p251z9.j.e(bVar, "<this>");
        p009aa.m mVar = bVar instanceof p009aa.m ? (p009aa.m) bVar : null;
        if (mVar != null) {
            return mVar;
        }
        throw new IllegalStateException("This serializer can be used only with Json format.Expected Decoder to be JsonDecoder, got " + p251z9.w.a(bVar.getClass()));
    }

    public static String h(String str, int i10, int i11) {
        if (i10 < 0) {
            return AbstractC0813f2.J("%s (%s) must not be negative", str, Integer.valueOf(i10));
        }
        if (i11 >= 0) {
            return AbstractC0813f2.J("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i10), Integer.valueOf(i11));
        }
        StringBuilder sb = new StringBuilder(26);
        sb.append("negative size: ");
        sb.append(i11);
        throw new IllegalArgumentException(sb.toString());
    }

    public static void j(int i10, int i11) {
        String strJ;
        if (i10 < 0 || i10 >= i11) {
            if (i10 < 0) {
                strJ = AbstractC0813f2.J("%s (%s) must not be negative", "index", Integer.valueOf(i10));
            } else {
                if (i11 < 0) {
                    StringBuilder sb = new StringBuilder(26);
                    sb.append("negative size: ");
                    sb.append(i11);
                    throw new IllegalArgumentException(sb.toString());
                }
                strJ = AbstractC0813f2.J("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i10), Integer.valueOf(i11));
            }
            throw new IndexOutOfBoundsException(strJ);
        }
    }

    public static void k(int i10, int i11) {
        if (i10 < 0 || i10 > i11) {
            throw new IndexOutOfBoundsException(h("index", i10, i11));
        }
    }

    public static void l(int i10, int i11, int i12) {
        String strH;
        if (i10 < 0 || i11 < i10 || i11 > i12) {
            if (i10 < 0 || i10 > i12) {
                strH = h("start index", i10, i12);
            } else {
                strH = (i11 < 0 || i11 > i12) ? h("end index", i11, i12) : AbstractC0813f2.J("end index (%s) must not be less than start index (%s)", Integer.valueOf(i11), Integer.valueOf(i10));
            }
            throw new IndexOutOfBoundsException(strH);
        }
    }

    public static final l0.r m(l0.r rVar, p180s0.J j) {
        return androidx.compose.ui.graphics.a.b(rVar, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, j, true, 124927);
    }

    public static final l0.r n(l0.r rVar) {
        return androidx.compose.ui.graphics.a.b(rVar, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, true, 126975);
    }

    public static void o(Channel channel) {
        if (channel != null) {
            try {
                channel.close();
            } catch (Exception unused) {
            }
        }
    }

    public static Type p(Type type) {
        if (!Collection.class.isAssignableFrom(Collection.class)) {
            throw new IllegalArgumentException();
        }
        Type typeF = V8.d.f(type, Collection.class, V8.d.c(type, Collection.class, Collection.class), new LinkedHashSet());
        if (typeF instanceof WildcardType) {
            typeF = ((WildcardType) typeF).getUpperBounds()[0];
        }
        return typeF instanceof ParameterizedType ? ((ParameterizedType) typeF).getActualTypeArguments()[0] : Object.class;
    }

    public static final double q(double d5, I9.c cVar, I9.c cVar2) {
        p251z9.j.e(cVar2, "targetUnit");
        TimeUnit timeUnit = cVar2.f3862r;
        TimeUnit timeUnit2 = cVar.f3862r;
        long jConvert = timeUnit.convert(1L, timeUnit2);
        return jConvert > 0 ? d5 * jConvert : d5 / timeUnit2.convert(1L, timeUnit);
    }

    public static final long r(long j, I9.c cVar, I9.c cVar2) {
        p251z9.j.e(cVar, "sourceUnit");
        p251z9.j.e(cVar2, "targetUnit");
        return cVar2.f3862r.convert(j, cVar.f3862r);
    }

    public static final long s(long j, I9.c cVar, I9.c cVar2) {
        p251z9.j.e(cVar, "sourceUnit");
        p251z9.j.e(cVar2, "targetUnit");
        return cVar2.f3862r.convert(j, cVar.f3862r);
    }

    public static final void t(int i10, int i11) {
        if (i10 <= i11) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i10 + ") is greater than size (" + i11 + ").");
    }

    public static final long u() {
        return Thread.currentThread().getId();
    }

    public static final boolean v(String str, String str2) {
        p251z9.j.e(str, "current");
        if (str.equals(str2)) {
            return true;
        }
        if (str.length() != 0) {
            int i10 = 0;
            int i11 = 0;
            int i12 = 0;
            while (i10 < str.length()) {
                char cCharAt = str.charAt(i10);
                int i13 = i12 + 1;
                if (i12 != 0 || cCharAt == '(') {
                    if (cCharAt == '(') {
                        i11++;
                    } else if (cCharAt == ')' && (i11 = i11 - 1) == 0 && i12 != str.length() - 1) {
                    }
                    i10++;
                    i12 = i13;
                }
            }
            if (i11 == 0) {
                String strSubstring = str.substring(1, str.length() - 1);
                p251z9.j.d(strSubstring, "substring(...)");
                return p251z9.j.a(H9.o.t1(strSubstring).toString(), str2);
            }
        }
        return false;
    }

    public static boolean w(Type type, Type type2) {
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            return type2 instanceof GenericArrayType ? w(((Class) type).getComponentType(), ((GenericArrayType) type2).getGenericComponentType()) : type.equals(type2);
        }
        if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            ParameterizedType parameterizedType2 = (ParameterizedType) type2;
            return w(parameterizedType.getOwnerType(), parameterizedType2.getOwnerType()) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType instanceof V8.b ? ((V8.b) parameterizedType).f8422t : parameterizedType.getActualTypeArguments(), parameterizedType2 instanceof V8.b ? ((V8.b) parameterizedType2).f8422t : parameterizedType2.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            if (type2 instanceof Class) {
                return w(((Class) type2).getComponentType(), ((GenericArrayType) type).getGenericComponentType());
            }
            if (type2 instanceof GenericArrayType) {
                return w(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
            }
            return false;
        }
        if (type instanceof WildcardType) {
            if (!(type2 instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) type;
            WildcardType wildcardType2 = (WildcardType) type2;
            return Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) && Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds());
        }
        if (!(type instanceof TypeVariable) || !(type2 instanceof TypeVariable)) {
            return false;
        }
        TypeVariable typeVariable = (TypeVariable) type;
        TypeVariable typeVariable2 = (TypeVariable) type2;
        return typeVariable.getGenericDeclaration() == typeVariable2.getGenericDeclaration() && typeVariable.getName().equals(typeVariable2.getName());
    }

    public static final String x(Collection collection) {
        p251z9.j.e(collection, "collection");
        if (collection.isEmpty()) {
            return " }";
        }
        return H9.p.H0(p120l9.m.l0(collection, ",\n", "\n", "\n", null, 56)) + "},";
    }

    public static p124m3.b y(ChapterHeader chapterHeader) {
        Chapter chapter = chapterHeader.getChapter();
        p251z9.j.b(chapter);
        int number = (int) chapter.getNumber();
        Page page = chapterHeader.getPage();
        p251z9.j.b(page);
        return new p124m3.b(chapterHeader.getCenterX(), chapterHeader.getCenterY(), number, (int) page.getNumber(), (int) chapterHeader.getLine());
    }

    public static final int z(Y0.l lVar, int i10) {
        boolean z10 = p251z9.j.f(lVar.f10364r, Y0.l.f10358s.f10364r) >= 0;
        boolean z11 = i10 == 1;
        if (z11 && z10) {
            return 3;
        }
        if (z10) {
            return 1;
        }
        return z11 ? 2 : 0;
    }

    public abstract void J();

    public abstract void K();

    public abstract void P(byte[] bArr, int i10, int i11);

    public boolean i() {
        return false;
    }

    public void H() {
    }
}
