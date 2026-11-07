package G9;

import java.io.File;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class f implements Iterator, A9.a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f2925r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Object f2926s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f2927t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Object f2928u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ i f2929v;

    public f(g gVar, char c10) {
        this.f2925r = 3;
        this.f2929v = gVar;
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f2928u = arrayDeque;
        File file = (File) gVar.f2931b;
        if (file.isDirectory()) {
            arrayDeque.push(c(file));
        } else if (file.isFile()) {
            arrayDeque.push(new v9.c(file));
        } else {
            this.f2927t = 2;
        }
    }

    public void a() {
        g gVar = (g) this.f2929v;
        Iterator it = (Iterator) this.f2926s;
        while (it.hasNext()) {
            Object next = it.next();
            if (!((Boolean) ((m) gVar.f2932c).e(next)).booleanValue()) {
                this.f2928u = next;
                this.f2927t = 1;
                return;
            }
        }
        this.f2927t = 0;
    }

    public void b() {
        Iterator it = (Iterator) this.f2926s;
        if (it.hasNext()) {
            Object next = it.next();
            if (((Boolean) ((p) this.f2929v).f2949c.e(next)).booleanValue()) {
                this.f2927t = 1;
                this.f2928u = next;
                return;
            }
        }
        this.f2927t = 0;
    }

    public v9.a c(File file) {
        int iOrdinal = ((v9.f) ((g) this.f2929v).f2932c).ordinal();
        if (iOrdinal == 0) {
            return new v9.d(file);
        }
        if (iOrdinal == 1) {
            return new v9.b(file);
        }
        throw new A6.a();
    }

    public boolean d() {
        g gVar = (g) this.f2929v;
        Iterator it = (Iterator) this.f2926s;
        Iterator it2 = (Iterator) this.f2928u;
        if (it2 != null && it2.hasNext()) {
            this.f2927t = 1;
            return true;
        }
        while (it.hasNext()) {
            Iterator it3 = (Iterator) o.f2946z.e(((A3.e) gVar.f2932c).e(it.next()));
            if (it3.hasNext()) {
                this.f2928u = it3;
                this.f2927t = 1;
                return true;
            }
        }
        this.f2927t = 2;
        this.f2928u = null;
        return false;
    }

    public boolean e() {
        File file;
        this.f2927t = 3;
        ArrayDeque arrayDeque = (ArrayDeque) this.f2928u;
        while (true) {
            v9.e eVar = (v9.e) arrayDeque.peek();
            if (eVar == null) {
                file = null;
                break;
            }
            File fileA = eVar.a();
            if (fileA == null) {
                arrayDeque.pop();
            } else {
                if (fileA.equals(eVar.f23392a) || !fileA.isDirectory() || arrayDeque.size() >= Integer.MAX_VALUE) {
                    file = fileA;
                    break;
                }
                arrayDeque.push(c(fileA));
            }
        }
        if (file != null) {
            this.f2926s = file;
            this.f2927t = 1;
        } else {
            this.f2927t = 2;
        }
        return this.f2927t == 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f2925r) {
            case 0:
                if (this.f2927t == -1) {
                    a();
                }
                return this.f2927t == 1;
            case 1:
                int i10 = this.f2927t;
                if (i10 == 1) {
                    return true;
                }
                if (i10 == 2) {
                    return false;
                }
                return d();
            case 2:
                if (this.f2927t == -1) {
                    b();
                }
                return this.f2927t == 1;
            default:
                int i11 = this.f2927t;
                if (i11 == 0) {
                    return e();
                }
                if (i11 == 1) {
                    return true;
                }
                if (i11 == 2) {
                    return false;
                }
                throw new IllegalArgumentException("hasNext called when the iterator is in the FAILED state.");
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f2925r) {
            case 0:
                if (this.f2927t == -1) {
                    a();
                }
                if (this.f2927t == 0) {
                    throw new NoSuchElementException();
                }
                Object obj = this.f2928u;
                this.f2928u = null;
                this.f2927t = -1;
                return obj;
            case 1:
                int i10 = this.f2927t;
                if (i10 == 2) {
                    throw new NoSuchElementException();
                }
                if (i10 == 0 && !d()) {
                    throw new NoSuchElementException();
                }
                this.f2927t = 0;
                Iterator it = (Iterator) this.f2928u;
                p251z9.j.b(it);
                return it.next();
            case 2:
                if (this.f2927t == -1) {
                    b();
                }
                if (this.f2927t == 0) {
                    throw new NoSuchElementException();
                }
                Object obj2 = this.f2928u;
                this.f2928u = null;
                this.f2927t = -1;
                return obj2;
            default:
                int i11 = this.f2927t;
                if (i11 == 1) {
                    this.f2927t = 0;
                    return (File) this.f2926s;
                }
                if (i11 == 2 || !e()) {
                    throw new NoSuchElementException();
                }
                this.f2927t = 0;
                return (File) this.f2926s;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f2925r) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 2:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public f(g gVar) {
        this.f2925r = 0;
        this.f2929v = gVar;
        this.f2926s = new q((p) gVar.f2931b);
        this.f2927t = -1;
    }

    public f(g gVar, byte b5) {
        this.f2925r = 1;
        this.f2929v = gVar;
        this.f2926s = new h((g) gVar.f2931b);
    }

    public f(p pVar) {
        this.f2925r = 2;
        this.f2929v = pVar;
        this.f2926s = pVar.f2948b.iterator();
        this.f2927t = -1;
    }
}
