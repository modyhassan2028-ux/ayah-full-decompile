package p056f2;

import android.util.Log;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import p064g2.c;

/* JADX INFO: renamed from: f2.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0928a implements H {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f16050a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f16051b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f16052c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f16053d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f16054e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f16055f;
    public boolean g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f16056h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f16057i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public CharSequence f16058k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f16059l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public CharSequence f16060m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ArrayList f16061n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ArrayList f16062o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f16063p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ArrayList f16064q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final K f16065r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f16066s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f16067t;

    public C0928a(K k7) {
        k7.H();
        C0949w c0949w = k7.f15982w;
        if (c0949w != null) {
            c0949w.f16173s.getClassLoader();
        }
        this.f16050a = new ArrayList();
        this.f16056h = true;
        this.f16063p = false;
        this.f16067t = -1;
        this.f16065r = k7;
    }

    @Override // p056f2.H
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        if (K.K(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.g) {
            return true;
        }
        this.f16065r.f15965d.add(this);
        return true;
    }

    public final void b(T t2) {
        this.f16050a.add(t2);
        t2.f16024d = this.f16051b;
        t2.f16025e = this.f16052c;
        t2.f16026f = this.f16053d;
        t2.g = this.f16054e;
    }

    public final void c(int i10) {
        if (this.g) {
            if (K.K(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i10);
            }
            ArrayList arrayList = this.f16050a;
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                T t2 = (T) arrayList.get(i11);
                AbstractComponentCallbacksC0947u abstractComponentCallbacksC0947u = t2.f16022b;
                if (abstractComponentCallbacksC0947u != null) {
                    abstractComponentCallbacksC0947u.f16136J += i10;
                    if (K.K(2)) {
                        Log.v("FragmentManager", "Bump nesting of " + t2.f16022b + " to " + t2.f16022b.f16136J);
                    }
                }
            }
        }
    }

    public final void d() {
        ArrayList arrayList = this.f16050a;
        int size = arrayList.size() - 1;
        while (size >= 0) {
            T t2 = (T) arrayList.get(size);
            if (t2.f16023c) {
                if (t2.f16021a == 8) {
                    t2.f16023c = false;
                    arrayList.remove(size - 1);
                    size--;
                } else {
                    int i10 = t2.f16022b.f16142P;
                    t2.f16021a = 2;
                    t2.f16023c = false;
                    for (int i11 = size - 1; i11 >= 0; i11--) {
                        T t10 = (T) arrayList.get(i11);
                        if (t10.f16023c && t10.f16022b.f16142P == i10) {
                            arrayList.remove(i11);
                            size--;
                        }
                    }
                }
            }
            size--;
        }
    }

    public final int e(boolean z10, boolean z11) {
        if (this.f16066s) {
            throw new IllegalStateException("commit already called");
        }
        if (K.K(2)) {
            Log.v("FragmentManager", "Commit: " + this);
            PrintWriter printWriter = new PrintWriter(new V());
            g("  ", printWriter, true);
            printWriter.close();
        }
        this.f16066s = true;
        boolean z12 = this.g;
        K k7 = this.f16065r;
        if (z12) {
            this.f16067t = k7.f15970k.getAndIncrement();
        } else {
            this.f16067t = -1;
        }
        if (z11) {
            k7.y(this, z10);
        }
        return this.f16067t;
    }

    public final void f(int i10, AbstractComponentCallbacksC0947u abstractComponentCallbacksC0947u, String str, int i11) {
        String str2 = abstractComponentCallbacksC0947u.f16152e0;
        if (str2 != null) {
            c.c(abstractComponentCallbacksC0947u, str2);
        }
        Class<?> cls = abstractComponentCallbacksC0947u.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str3 = abstractComponentCallbacksC0947u.Q;
            if (str3 != null && !str.equals(str3)) {
                throw new IllegalStateException("Can't change tag of fragment " + abstractComponentCallbacksC0947u + ": was " + abstractComponentCallbacksC0947u.Q + " now " + str);
            }
            abstractComponentCallbacksC0947u.Q = str;
        }
        if (i10 != 0) {
            if (i10 == -1) {
                throw new IllegalArgumentException("Can't add fragment " + abstractComponentCallbacksC0947u + " with tag " + str + " to container view with no id");
            }
            int i12 = abstractComponentCallbacksC0947u.f16141O;
            if (i12 != 0 && i12 != i10) {
                throw new IllegalStateException("Can't change container ID of fragment " + abstractComponentCallbacksC0947u + ": was " + abstractComponentCallbacksC0947u.f16141O + " now " + i10);
            }
            abstractComponentCallbacksC0947u.f16141O = i10;
            abstractComponentCallbacksC0947u.f16142P = i10;
        }
        b(new T(i11, abstractComponentCallbacksC0947u));
        abstractComponentCallbacksC0947u.f16137K = this.f16065r;
    }

    public final void g(String str, PrintWriter printWriter, boolean z10) {
        String str2;
        if (z10) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f16057i);
            printWriter.print(" mIndex=");
            printWriter.print(this.f16067t);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f16066s);
            if (this.f16055f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f16055f));
            }
            if (this.f16051b != 0 || this.f16052c != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f16051b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f16052c));
            }
            if (this.f16053d != 0 || this.f16054e != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f16053d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f16054e));
            }
            if (this.j != 0 || this.f16058k != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.j));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f16058k);
            }
            if (this.f16059l != 0 || this.f16060m != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f16059l));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f16060m);
            }
        }
        ArrayList arrayList = this.f16050a;
        if (arrayList.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            T t2 = (T) arrayList.get(i10);
            switch (t2.f16021a) {
                case 0:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case 3:
                    str2 = "REMOVE";
                    break;
                case 4:
                    str2 = "HIDE";
                    break;
                case 5:
                    str2 = "SHOW";
                    break;
                case 6:
                    str2 = "DETACH";
                    break;
                case 7:
                    str2 = "ATTACH";
                    break;
                case 8:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    str2 = "cmd=" + t2.f16021a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i10);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(t2.f16022b);
            if (z10) {
                if (t2.f16024d != 0 || t2.f16025e != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(t2.f16024d));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(t2.f16025e));
                }
                if (t2.f16026f != 0 || t2.g != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(t2.f16026f));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(t2.g));
                }
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f16067t >= 0) {
            sb.append(" #");
            sb.append(this.f16067t);
        }
        if (this.f16057i != null) {
            sb.append(" ");
            sb.append(this.f16057i);
        }
        sb.append("}");
        return sb.toString();
    }
}
