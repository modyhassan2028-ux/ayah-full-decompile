package p098j6;

import K9.AbstractC0405x;
import K9.H;
import K9.InterfaceC0402u;
import R9.d;
import android.content.Context;
import android.widget.EditText;
import androidx.appcompat.widget.Toolbar;
import com.ayah.R;
import com.ayah.note.NoteActivity;
import p110k9.y;
import p150o9.c;
import p161p9.a;
import p241y9.e;
import p251z9.j;
import q9.i;

/* JADX INFO: loaded from: classes.dex */
public final class b extends i implements e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f18782r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f18783s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ NoteActivity f18784t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(NoteActivity noteActivity, c cVar, int i10) {
        super(2, cVar);
        this.f18782r = i10;
        this.f18784t = noteActivity;
    }

    @Override // q9.a
    public final c create(Object obj, c cVar) {
        switch (this.f18782r) {
            case 0:
                return new b(this.f18784t, cVar, 0);
            case 1:
                return new b(this.f18784t, cVar, 1);
            default:
                return new b(this.f18784t, cVar, 2);
        }
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC0402u interfaceC0402u = (InterfaceC0402u) obj;
        c cVar = (c) obj2;
        switch (this.f18782r) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((b) create(interfaceC0402u, cVar)).invokeSuspend(y.f19095a);
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        int i10 = this.f18782r;
        y yVar = y.f19095a;
        c cVar = null;
        NoteActivity noteActivity = this.f18784t;
        a aVar = a.f21156r;
        switch (i10) {
            case 0:
                int i11 = this.f18783s;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p110k9.a.e(obj);
                    return obj;
                }
                p110k9.a.e(obj);
                p074h0.i iVar = noteActivity.f13918h0;
                if (iVar == null) {
                    j.k("notesPresenter");
                    throw null;
                }
                int i12 = noteActivity.f13913c0;
                this.f18783s = 1;
                Object objZ = iVar.z(i12, this);
                return objZ == aVar ? aVar : objZ;
            case 1:
                int i13 = this.f18783s;
                if (i13 == 0) {
                    p110k9.a.e(obj);
                    R9.e eVar = H.f5322a;
                    d dVar = d.f7436t;
                    b bVar = new b(noteActivity, cVar, 0);
                    this.f18783s = 1;
                    obj = AbstractC0405x.I(dVar, bVar, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p110k9.a.e(obj);
                }
                p108k6.a aVar2 = (p108k6.a) obj;
                noteActivity.f13917g0 = aVar2.f19031a;
                E3.c cVar2 = aVar2.f19032b;
                if (cVar2 != null) {
                    noteActivity.f13911a0 = true;
                    noteActivity.f13912b0 = cVar2.f1841a;
                    String str = cVar2.f1843c;
                    EditText editText = noteActivity.f13914d0;
                    if (editText == null) {
                        j.k("editor");
                        throw null;
                    }
                    editText.setText(str);
                    EditText editText2 = noteActivity.f13914d0;
                    if (editText2 == null) {
                        j.k("editor");
                        throw null;
                    }
                    editText2.setSelection(str.length());
                }
                EditText editText3 = noteActivity.f13914d0;
                if (editText3 == null) {
                    j.k("editor");
                    throw null;
                }
                editText3.requestFocus();
                Toolbar toolbar = noteActivity.f13915e0;
                if (toolbar == null) {
                    j.k("toolbar");
                    throw null;
                }
                p124m3.j jVar = noteActivity.f13917g0;
                if (jVar == null) {
                    j.k("verseDao");
                    throw null;
                }
                Context context = toolbar.getContext();
                j.d(context, "getContext(...)");
                toolbar.setTitle(jVar.d(context));
                toolbar.m(R.menu.note);
                toolbar.setOnMenuItemClickListener(new C6.b(18, noteActivity));
                return yVar;
            default:
                int i14 = this.f18783s;
                if (i14 != 0) {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p110k9.a.e(obj);
                    return yVar;
                }
                p110k9.a.e(obj);
                R9.e eVar2 = H.f5322a;
                d dVar2 = d.f7436t;
                D3.b bVar2 = new D3.b(noteActivity, cVar, 6);
                this.f18783s = 1;
                return AbstractC0405x.I(dVar2, bVar2, this) == aVar ? aVar : yVar;
        }
    }
}
