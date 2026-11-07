package H8;

import Ca.k;
import Ca.q;
import Da.r;
import Da.t;
import R7.o;
import Y0.n;
import Y0.p;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.internal.measurement.B1;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import p120l9.l;

/* JADX INFO: loaded from: classes.dex */
public final class e implements C2.d, Ca.i, N6.a, R3.b, p, p105k2.b, p017b7.c, p017b7.e {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ e f3597s = new e(28);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f3598r;

    public /* synthetic */ e(int i10) {
        this.f3598r = i10;
    }

    public static final void l(Da.e eVar, long j, boolean z10) {
        r rVar = Da.e.f1353h;
        if (Da.e.f1354i == null) {
            Da.e.f1354i = new Da.e();
            Da.b bVar = new Da.b("Okio Watchdog");
            bVar.setDaemon(true);
            bVar.start();
        }
        long jNanoTime = System.nanoTime();
        if (j != 0 && z10) {
            eVar.g = Math.min(j, eVar.c() - jNanoTime) + jNanoTime;
        } else if (j != 0) {
            eVar.g = jNanoTime + j;
        } else {
            if (!z10) {
                throw new AssertionError();
            }
            eVar.g = eVar.c();
        }
        r rVar2 = Da.e.f1353h;
        int i10 = rVar2.f1387s + 1;
        rVar2.f1387s = i10;
        Da.e[] eVarArr = (Da.e[]) rVar2.f1388t;
        if (i10 == eVarArr.length) {
            Da.e[] eVarArr2 = new Da.e[i10 * 2];
            l.b0(0, 0, 14, eVarArr, eVarArr2);
            rVar2.f1388t = eVarArr2;
        }
        rVar2.i(i10, eVar);
        if (eVar.f1359f == 1) {
            Da.e.f1355k.signal();
        }
    }

    public static Da.e m() throws InterruptedException {
        r rVar = Da.e.f1353h;
        Da.e eVar = ((Da.e[]) rVar.f1388t)[1];
        if (eVar == null) {
            long jNanoTime = System.nanoTime();
            Da.e.f1355k.await(Da.e.f1356l, TimeUnit.MILLISECONDS);
            if (((Da.e[]) rVar.f1388t)[1] != null || System.nanoTime() - jNanoTime < Da.e.f1357m) {
                return null;
            }
            return Da.e.f1354i;
        }
        long jNanoTime2 = eVar.g - System.nanoTime();
        if (jNanoTime2 > 0) {
            Da.e.f1355k.await(jNanoTime2, TimeUnit.NANOSECONDS);
            return null;
        }
        rVar.p(eVar);
        eVar.f1358e = 2;
        return eVar;
    }

    public static e n(Context context, int i10) {
        B0.c.g("Cannot create a CalendarItemStyle with a styleResId of 0", i10 != 0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i10, p128m7.a.f19635C);
        Rect rect = new Rect(typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(2, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(3, 0));
        va.g.w(context, typedArrayObtainStyledAttributes, 4);
        va.g.w(context, typedArrayObtainStyledAttributes, 9);
        va.g.w(context, typedArrayObtainStyledAttributes, 7);
        typedArrayObtainStyledAttributes.getDimensionPixelSize(8, 0);
        o.a(context, typedArrayObtainStyledAttributes.getResourceId(5, 0), typedArrayObtainStyledAttributes.getResourceId(6, 0)).a();
        typedArrayObtainStyledAttributes.recycle();
        e eVar = new e(25);
        B0.c.h(rect.left);
        B0.c.h(rect.top);
        B0.c.h(rect.right);
        B0.c.h(rect.bottom);
        return eVar;
    }

    public static Typeface o(String str, Y0.l lVar, int i10) {
        if (i10 == 0 && p251z9.j.a(lVar, Y0.l.f10359t) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        int iZ = B1.z(lVar, i10);
        return (str == null || str.length() == 0) ? Typeface.defaultFromStyle(iZ) : Typeface.create(str, iZ);
    }

    public static Path p(float f3, float f7, float f10, float f11) {
        Path path = new Path();
        path.moveTo(f3, f7);
        path.lineTo(f10, f11);
        return path;
    }

    public static final boolean q() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001b  */
    @Override // Y0.p
    public Typeface a(n nVar, Y0.l lVar, int i10) {
        String str;
        nVar.getClass();
        int i11 = lVar.f10364r / 100;
        if (i11 >= 0 && i11 < 2) {
            str = "sans-serif-thin";
        } else if (2 <= i11 && i11 < 4) {
            str = "sans-serif-light";
        } else if (i11 == 4) {
            str = "sans-serif";
        } else if (i11 == 5) {
            str = "sans-serif-medium";
        } else if ((6 > i11 || i11 >= 8) && 8 <= i11 && i11 < 11) {
            str = "sans-serif-black";
        } else {
            str = "sans-serif";
        }
        Typeface typeface = null;
        if (str.length() != 0) {
            Typeface typefaceO = o(str, lVar, i10);
            if (!p251z9.j.a(typefaceO, Typeface.create(Typeface.DEFAULT, B1.z(lVar, i10))) && !p251z9.j.a(typefaceO, o(null, lVar, i10))) {
                typeface = typefaceO;
            }
        }
        return typeface == null ? o("sans-serif", lVar, i10) : typeface;
    }

    @Override // Y0.p
    public Typeface b(Y0.l lVar, int i10) {
        return o(null, lVar, i10);
    }

    @Override // p017b7.c
    public int c(Context context, String str) {
        return p017b7.f.a(context, str);
    }

    @Override // Ca.i
    public Object d(q qVar) throws ProtocolException {
        switch (this.f3598r) {
            case 4:
                p251z9.j.e(qVar, "reader");
                t tVar = qVar.f842b;
                if (qVar.b() == -1 || qVar.f846f) {
                    throw new ProtocolException("constructed bit strings not supported for DER");
                }
                if (qVar.b() < 1) {
                    throw new ProtocolException("malformed bit string");
                }
                return new k(tVar.k(qVar.b()), tVar.readByte() & 255);
            case 5:
                p251z9.j.e(qVar, "reader");
                return qVar.d();
            case 6:
                p251z9.j.e(qVar, "reader");
                return null;
            default:
                p251z9.j.e(qVar, "reader");
                return qVar.d();
        }
    }

    @Override // N6.a
    public long e() {
        return SystemClock.elapsedRealtime();
    }

    @Override // R3.b
    public R3.a f(int i10, int i11) {
        int iRint = (int) (i11 * 0.03f);
        int i12 = iRint * 2;
        int i13 = i11 - i12;
        int iMin = Math.min(i10, (int) Math.floor(i13 * 0.625f));
        float f3 = iMin;
        int iRint2 = (int) Math.rint(f3 / 0.54347825f);
        if (i13 > iRint2) {
            iRint = (int) Math.rint((i12 + iRint2) * 0.03f);
            i13 = iRint2;
        }
        return new R3.a(iMin, i13, iMin - (((int) (f3 * 0.027f)) * 2), iRint);
    }

    @Override // C2.d
    public void g() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // C2.d
    public void h(int i10, Object obj) {
        String str;
        switch (i10) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i10 == 6 || i10 == 7 || i10 == 8) {
            Log.e("ProfileInstaller", str, (Throwable) obj);
        } else {
            Log.d("ProfileInstaller", str);
        }
    }

    @Override // p017b7.e
    public p017b7.d i(Context context, String str, p017b7.c cVar) {
        int iJ;
        p017b7.d dVar = new p017b7.d();
        int iC = cVar.c(context, str);
        dVar.f13308a = iC;
        int i10 = 1;
        int i11 = 0;
        if (iC != 0) {
            iJ = cVar.j(context, str, false);
            dVar.f13309b = iJ;
        } else {
            iJ = cVar.j(context, str, true);
            dVar.f13309b = iJ;
        }
        int i12 = dVar.f13308a;
        if (i12 == 0) {
            if (iJ == 0) {
                i10 = 0;
            }
            dVar.f13310c = i10;
            return dVar;
        }
        i11 = i12;
        if (i11 >= iJ) {
            i10 = -1;
        }
        dVar.f13310c = i10;
        return dVar;
    }

    @Override // p017b7.c
    public int j(Context context, String str, boolean z10) {
        return p017b7.f.d(context, str, z10);
    }

    @Override // Ca.i
    public void k(Ca.r rVar, Object obj) {
        switch (this.f3598r) {
            case 4:
                k kVar = (k) obj;
                p251z9.j.e(rVar, "writer");
                p251z9.j.e(kVar, "value");
                Da.i iVarD = rVar.d();
                iVarD.writeByte(kVar.f824b);
                iVarD.v(kVar.f823a);
                break;
            case 5:
                String str = (String) obj;
                p251z9.j.e(rVar, "writer");
                p251z9.j.e(str, "value");
                rVar.h(str);
                break;
            case 6:
                p251z9.j.e(rVar, "writer");
                break;
            default:
                String str2 = (String) obj;
                p251z9.j.e(rVar, "writer");
                p251z9.j.e(str2, "value");
                rVar.h(str2);
                break;
        }
    }

    public e(int[] iArr, ValueAnimator valueAnimator) {
        this.f3598r = 10;
    }
}
