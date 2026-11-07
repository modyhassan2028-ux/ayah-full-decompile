package U6;

import E2.N0;
import I1.InterfaceC0268v;
import T1.C0485b;
import T1.InterfaceC0486c;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import androidx.lifecycle.InterfaceC0762k;
import androidx.lifecycle.S;
import androidx.lifecycle.T;
import androidx.lifecycle.V;
import com.google.android.gms.internal.measurement.C0849m3;
import com.google.firebase.analytics.connector.internal.AnalyticsConnectorRegistrar;
import i7.InterfaceC1034y;
import j$.util.DesugarTimeZone;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.net.ProtocolException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import u.M;

/* JADX INFO: renamed from: U6.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0532j implements C2.d, Ca.i, p150o9.g, InterfaceC0268v, R2.b, InterfaceC0486c, p105k2.b, p017b7.e, p100j8.c, InterfaceC1034y {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static C0532j f8278s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static C0532j f8279t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static C0532j f8280u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ C0532j f8281v = new C0532j(28);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ C0532j f8282w = new C0532j(29);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f8283r;

    public /* synthetic */ C0532j(int i10) {
        this.f8283r = i10;
    }

    public static void b(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static T e(V v10, S s10, int i10) {
        if ((i10 & 2) != 0) {
            s10 = v10 instanceof InterfaceC0762k ? ((InterfaceC0762k) v10).e() : p123m2.a.f19522a;
        }
        p105k2.c cVarF = v10 instanceof InterfaceC0762k ? ((InterfaceC0762k) v10).f() : p105k2.a.f18957b;
        p251z9.j.e(s10, "factory");
        p251z9.j.e(cVarF, "extras");
        return new T(v10.g(), s10, cVarF);
    }

    public static M.k j(Context context, String[] strArr, String str) {
        int i10;
        String[] strArrP = p(context);
        int length = strArrP.length;
        boolean z10 = false;
        int i11 = 0;
        while (true) {
            ZipFile zipFile = null;
            if (i11 >= length) {
                return null;
            }
            String str2 = strArrP[i11];
            int i12 = 0;
            while (true) {
                int i13 = i12 + 1;
                i10 = 5;
                if (i12 >= 5) {
                    break;
                }
                try {
                    zipFile = new ZipFile(new File(str2), 1);
                    break;
                } catch (IOException unused) {
                    i12 = i13;
                }
            }
            if (zipFile != null) {
                int i14 = 0;
                while (true) {
                    int i15 = i14 + 1;
                    if (i14 >= i10) {
                        try {
                            zipFile.close();
                            break;
                        } catch (IOException unused2) {
                            break;
                        }
                    }
                    int length2 = strArr.length;
                    int i16 = 0;
                    while (i16 < length2) {
                        String str3 = strArr[i16];
                        StringBuilder sb = new StringBuilder("lib");
                        char c10 = File.separatorChar;
                        sb.append(c10);
                        sb.append(str3);
                        sb.append(c10);
                        sb.append(str);
                        String string = sb.toString();
                        int i17 = 2;
                        android.support.v4.media.session.r.I("Looking for %s in APK %s...", string, str2);
                        ZipEntry entry = zipFile.getEntry(string);
                        if (entry != null) {
                            M.k kVar = new M.k(i17, z10);
                            kVar.f5618s = zipFile;
                            kVar.f5619t = entry;
                            return kVar;
                        }
                        i16++;
                        i10 = 5;
                    }
                    i14 = i15;
                }
            }
            i11++;
        }
    }

    public static String[] m(Context context, String str) {
        StringBuilder sb = new StringBuilder("lib");
        char c10 = File.separatorChar;
        sb.append(c10);
        sb.append("([^\\");
        sb.append(c10);
        sb.append("]*)");
        sb.append(c10);
        sb.append(str);
        Pattern patternCompile = Pattern.compile(sb.toString());
        HashSet hashSet = new HashSet();
        for (String str2 : p(context)) {
            try {
                Enumeration<? extends ZipEntry> enumerationEntries = new ZipFile(new File(str2), 1).entries();
                while (enumerationEntries.hasMoreElements()) {
                    Matcher matcher = patternCompile.matcher(enumerationEntries.nextElement().getName());
                    if (matcher.matches()) {
                        hashSet.add(matcher.group(1));
                    }
                }
            } catch (IOException unused) {
            }
        }
        return (String[]) hashSet.toArray(new String[hashSet.size()]);
    }

    public static StaticLayout o(C0532j c0532j, CharSequence charSequence, TextPaint textPaint, int i10, int i11) {
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        if ((i11 & 8) != 0) {
            alignment = Layout.Alignment.ALIGN_NORMAL;
        }
        float f3 = (i11 & 16) != 0 ? 1.0f : 1.1f;
        p251z9.j.e(charSequence, "text");
        p251z9.j.e(alignment, "alignment");
        StaticLayout staticLayoutBuild = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i10).setLineSpacing(0.0f, f3).setAlignment(alignment).build();
        p251z9.j.b(staticLayoutBuild);
        return staticLayoutBuild;
    }

    public static String[] p(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        String[] strArr = applicationInfo.splitSourceDirs;
        if (strArr == null || strArr.length == 0) {
            return new String[]{applicationInfo.sourceDir};
        }
        String[] strArr2 = new String[strArr.length + 1];
        strArr2[0] = applicationInfo.sourceDir;
        System.arraycopy(strArr, 0, strArr2, 1, strArr.length);
        return strArr2;
    }

    @Override // i7.InterfaceC1034y
    public Object a() {
        return new Boolean(((Boolean) C0849m3.f14363a.b()).booleanValue());
    }

    @Override // p100j8.c
    public /* synthetic */ Object c(E6.u uVar) {
        return AnalyticsConnectorRegistrar.lambda$getComponents$0(uVar);
    }

    @Override // Ca.i
    public Object d(Ca.q qVar) throws ProtocolException {
        switch (this.f8283r) {
            case 4:
                p251z9.j.e(qVar, "reader");
                String strD = qVar.d();
                Ca.j jVar = Ca.c.f790a;
                TimeZone timeZone = DesugarTimeZone.getTimeZone("GMT");
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss'Z'");
                simpleDateFormat.setTimeZone(timeZone);
                try {
                    return Long.valueOf(simpleDateFormat.parse(strD).getTime());
                } catch (ParseException unused) {
                    throw new ProtocolException("Failed to parse GeneralizedTime ".concat(strD));
                }
            case 5:
                p251z9.j.e(qVar, "reader");
                Da.t tVar = qVar.f842b;
                long jB = qVar.b();
                if (1 <= jB && jB < 9) {
                    long j = tVar.readByte();
                    while (qVar.a() < qVar.f843c) {
                        j = (j << 8) + ((long) (tVar.readByte() & 255));
                    }
                    return Long.valueOf(j);
                }
                throw new ProtocolException("unexpected length: " + qVar.b() + " at " + qVar);
            case 6:
                p251z9.j.e(qVar, "reader");
                if (qVar.b() == -1 || qVar.f846f) {
                    throw new ProtocolException("constructed octet strings not supported for DER");
                }
                return qVar.f842b.k(qVar.b());
            default:
                p251z9.j.e(qVar, "reader");
                return qVar.d();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b A[DONT_INVERT, PHI: r4
      0x001b: PHI (r4v2 int) = (r4v1 int), (r4v3 int) binds: [B:3:0x0014, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    @Override // p017b7.e
    public p017b7.d i(Context context, String str, p017b7.c cVar) {
        p017b7.d dVar = new p017b7.d();
        dVar.f13308a = cVar.c(context, str);
        int i10 = 1;
        int iJ = cVar.j(context, str, true);
        dVar.f13309b = iJ;
        int i11 = dVar.f13308a;
        if (i11 == 0) {
            i11 = 0;
            if (iJ == 0) {
                i10 = 0;
            } else if (i11 >= iJ) {
                i10 = -1;
            }
        } else if (i11 >= iJ) {
            i10 = -1;
        }
        dVar.f13310c = i10;
        return dVar;
    }

    @Override // Ca.i
    public void k(Ca.r rVar, Object obj) {
        switch (this.f8283r) {
            case 4:
                long jLongValue = ((Number) obj).longValue();
                p251z9.j.e(rVar, "writer");
                Ca.j jVar = Ca.c.f790a;
                TimeZone timeZone = DesugarTimeZone.getTimeZone("GMT");
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss'Z'");
                simpleDateFormat.setTimeZone(timeZone);
                String str = simpleDateFormat.format(Long.valueOf(jLongValue));
                p251z9.j.d(str, "format(...)");
                rVar.h(str);
                break;
            case 5:
                long jLongValue2 = ((Number) obj).longValue();
                p251z9.j.e(rVar, "writer");
                Da.i iVarD = rVar.d();
                int iNumberOfLeadingZeros = ((((65 - (jLongValue2 < 0 ? Long.numberOfLeadingZeros(~jLongValue2) : Long.numberOfLeadingZeros(jLongValue2))) + 7) / 8) - 1) * 8;
                int iC = p186s9.b.c(iNumberOfLeadingZeros, 0, -8);
                if (iC <= iNumberOfLeadingZeros) {
                    while (true) {
                        iVarD.writeByte((int) (jLongValue2 >> iNumberOfLeadingZeros));
                        if (iNumberOfLeadingZeros != iC) {
                            iNumberOfLeadingZeros -= 8;
                        }
                    }
                }
                break;
            case 6:
                Da.k kVar = (Da.k) obj;
                p251z9.j.e(rVar, "writer");
                p251z9.j.e(kVar, "value");
                rVar.d().v(kVar);
                break;
            default:
                String str2 = (String) obj;
                p251z9.j.e(rVar, "writer");
                p251z9.j.e(str2, "value");
                rVar.h(str2);
                break;
        }
    }

    public Signature[] l(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }

    public boolean n(CharSequence charSequence) {
        return false;
    }

    @Override // R2.b
    public R2.c s(android.support.v4.media.session.r rVar) {
        return new S2.g((Context) rVar.f11364s, (String) rVar.f11365t, (Da.r) rVar.f11366u);
    }

    public C0532j() {
        this.f8283r = 17;
        new N0(16);
        long[] jArr = M.f22699a;
        new u.E();
    }

    @Override // C2.d
    public void g() {
    }

    @Override // T1.InterfaceC0486c
    public Object f(C0485b c0485b) throws C0485b {
        throw c0485b;
    }

    @Override // C2.d
    public void h(int i10, Object obj) {
    }

    @Override // I1.InterfaceC0268v
    public void onScrollLimit(int i10, int i11, int i12, boolean z10) {
    }

    @Override // I1.InterfaceC0268v
    public void onScrollProgress(int i10, int i11, int i12, int i13) {
    }
}
