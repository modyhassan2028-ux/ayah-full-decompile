package p132n1;

import android.util.Log;
import io.realm.RealmFieldTypeConstants;
import java.util.HashMap;
import java.util.LinkedHashMap;
import p153p1.e;
import s1.a;
import s1.g;
import s1.i;
import s1.j;
import s1.k;
import s1.l;

/* JADX INFO: loaded from: classes.dex */
public final class m implements Comparable {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f19888t;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f19886r = 1.0f;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f19887s = 0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public float f19889u = 0.0f;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public float f19890v = 0.0f;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public float f19891w = 0.0f;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public float f19892x = 0.0f;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public float f19893y = 1.0f;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public float f19894z = 1.0f;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public float f19878A = Float.NaN;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public float f19879B = Float.NaN;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public float f19880C = 0.0f;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public float f19881D = 0.0f;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public float f19882E = 0.0f;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public float f19883F = Float.NaN;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public float f19884G = Float.NaN;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final LinkedHashMap f19885H = new LinkedHashMap();

    public static boolean b(float f3, float f7) {
        if (Float.isNaN(f3) || Float.isNaN(f7)) {
            return Float.isNaN(f3) != Float.isNaN(f7);
        }
        return Math.abs(f3 - f7) > 1.0E-6f;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void a(HashMap map, int i10) {
        for (String str : map.keySet()) {
            F f3 = (F) map.get(str);
            str.getClass();
            byte b5 = -1;
            switch (str.hashCode()) {
                case -1249320806:
                    if (str.equals("rotationX")) {
                        b5 = 0;
                    }
                    break;
                case -1249320805:
                    if (str.equals("rotationY")) {
                        b5 = 1;
                    }
                    break;
                case -1225497657:
                    if (str.equals("translationX")) {
                        b5 = 2;
                    }
                    break;
                case -1225497656:
                    if (str.equals("translationY")) {
                        b5 = 3;
                    }
                    break;
                case -1225497655:
                    if (str.equals("translationZ")) {
                        b5 = 4;
                    }
                    break;
                case -1001078227:
                    if (str.equals("progress")) {
                        b5 = 5;
                    }
                    break;
                case -908189618:
                    if (str.equals("scaleX")) {
                        b5 = 6;
                    }
                    break;
                case -908189617:
                    if (str.equals("scaleY")) {
                        b5 = 7;
                    }
                    break;
                case -760884510:
                    if (str.equals("transformPivotX")) {
                        b5 = 8;
                    }
                    break;
                case -760884509:
                    if (str.equals("transformPivotY")) {
                        b5 = 9;
                    }
                    break;
                case -40300674:
                    if (str.equals("rotation")) {
                        b5 = 10;
                    }
                    break;
                case -4379043:
                    if (str.equals("elevation")) {
                        b5 = 11;
                    }
                    break;
                case 37232917:
                    if (str.equals("transitionPathRotate")) {
                        b5 = 12;
                    }
                    break;
                case 92909918:
                    if (str.equals("alpha")) {
                        b5 = 13;
                    }
                    break;
            }
            switch (b5) {
                case 0:
                    f3.b(i10, Float.isNaN(this.f19891w) ? 0.0f : this.f19891w);
                    break;
                case 1:
                    f3.b(i10, Float.isNaN(this.f19892x) ? 0.0f : this.f19892x);
                    break;
                case 2:
                    f3.b(i10, Float.isNaN(this.f19880C) ? 0.0f : this.f19880C);
                    break;
                case 3:
                    f3.b(i10, Float.isNaN(this.f19881D) ? 0.0f : this.f19881D);
                    break;
                case 4:
                    f3.b(i10, Float.isNaN(this.f19882E) ? 0.0f : this.f19882E);
                    break;
                case 5:
                    f3.b(i10, Float.isNaN(this.f19884G) ? 0.0f : this.f19884G);
                    break;
                case 6:
                    f3.b(i10, Float.isNaN(this.f19893y) ? 1.0f : this.f19893y);
                    break;
                case 7:
                    f3.b(i10, Float.isNaN(this.f19894z) ? 1.0f : this.f19894z);
                    break;
                case 8:
                    f3.b(i10, Float.isNaN(this.f19878A) ? 0.0f : this.f19878A);
                    break;
                case 9:
                    f3.b(i10, Float.isNaN(this.f19879B) ? 0.0f : this.f19879B);
                    break;
                case 10:
                    f3.b(i10, Float.isNaN(this.f19890v) ? 0.0f : this.f19890v);
                    break;
                case 11:
                    f3.b(i10, Float.isNaN(this.f19889u) ? 0.0f : this.f19889u);
                    break;
                case 12:
                    f3.b(i10, Float.isNaN(this.f19883F) ? 0.0f : this.f19883F);
                    break;
                case RealmFieldTypeConstants.CORE_TYPE_VALUE_LIST /* 13 */:
                    f3.b(i10, Float.isNaN(this.f19886r) ? 1.0f : this.f19886r);
                    break;
                default:
                    if (str.startsWith("CUSTOM")) {
                        String str2 = str.split(",")[1];
                        LinkedHashMap linkedHashMap = this.f19885H;
                        if (linkedHashMap.containsKey(str2)) {
                            a aVar = (a) linkedHashMap.get(str2);
                            if (f3 instanceof C) {
                                ((C) f3).f19834f.append(i10, aVar);
                            } else {
                                Log.e("MotionPaths", str + " splineSet not a CustomSet frame = " + i10 + ", value" + aVar.b() + f3);
                            }
                        } else {
                            Log.e("MotionPaths", "UNKNOWN customName " + str2);
                        }
                    } else {
                        Log.e("MotionPaths", "UNKNOWN spline ".concat(str));
                    }
                    break;
            }
        }
    }

    public final void c(e eVar, l lVar, int i10) {
        eVar.n();
        eVar.o();
        g gVarG = lVar.g(i10);
        j jVar = gVarG.f21934b;
        i iVar = gVarG.f21935c;
        int i11 = jVar.f22004c;
        this.f19887s = i11;
        int i12 = jVar.f22003b;
        this.f19888t = i12;
        this.f19886r = (i12 == 0 || i11 != 0) ? jVar.f22005d : 0.0f;
        k kVar = gVarG.f21937e;
        boolean z10 = kVar.f22017l;
        this.f19889u = kVar.f22018m;
        this.f19890v = kVar.f22009b;
        this.f19891w = kVar.f22010c;
        this.f19892x = kVar.f22011d;
        this.f19893y = kVar.f22012e;
        this.f19894z = kVar.f22013f;
        this.f19878A = kVar.g;
        this.f19879B = kVar.f22014h;
        this.f19880C = kVar.f22015i;
        this.f19881D = kVar.j;
        this.f19882E = kVar.f22016k;
        m1.e.c(iVar.f21998c);
        this.f19883F = iVar.g;
        this.f19884G = gVarG.f21934b.f22006e;
        for (String str : gVarG.f21938f.keySet()) {
            a aVar = (a) gVarG.f21938f.get(str);
            if (aVar.f21854b != 5) {
                this.f19885H.put(str, aVar);
            }
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        ((m) obj).getClass();
        return Float.compare(0.0f, 0.0f);
    }
}
