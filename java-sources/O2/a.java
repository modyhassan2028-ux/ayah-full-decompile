package O2;

import androidx.lifecycle.EnumC0766o;
import androidx.lifecycle.InterfaceC0769s;
import androidx.lifecycle.InterfaceC0771u;
import java.util.ArrayList;
import p120l9.m;
import p173r2.j;
import p197u2.d;
import p197u2.h;
import p241y9.c;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements InterfaceC0769s {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f6448r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f6449s;

    public /* synthetic */ a(int i10, Object obj) {
        this.f6448r = i10;
        this.f6449s = obj;
    }

    @Override // androidx.lifecycle.InterfaceC0769s
    public final void n(InterfaceC0771u interfaceC0771u, EnumC0766o enumC0766o) {
        switch (this.f6448r) {
            case 0:
                b bVar = (b) this.f6449s;
                if (enumC0766o == EnumC0766o.ON_START) {
                    bVar.f6456h = true;
                } else if (enumC0766o == EnumC0766o.ON_STOP) {
                    bVar.f6456h = false;
                }
                break;
            case 1:
                ((c) this.f6449s).e(enumC0766o);
                break;
            default:
                h hVar = (h) this.f6449s;
                hVar.f22863q = enumC0766o.a();
                if (hVar.f22851c != null) {
                    ArrayList arrayListD0 = m.D0(hVar.f22854f);
                    int size = arrayListD0.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayListD0.get(i10);
                        i10++;
                        j jVar = (j) obj;
                        jVar.getClass();
                        d dVar = jVar.f21448y;
                        dVar.getClass();
                        dVar.f22826a.f21444u = enumC0766o.a();
                        dVar.f22829d = enumC0766o.a();
                        dVar.b();
                    }
                }
                break;
        }
    }
}
