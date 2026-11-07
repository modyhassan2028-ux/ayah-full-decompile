package P7;

import H9.o;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import com.ayah.note.NoteActivity;
import com.google.android.gms.internal.measurement.J1;
import com.google.android.material.search.SearchView;
import p151p.Q0;
import p151p.V;

/* JADX INFO: loaded from: classes.dex */
public final class h implements TextWatcher {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f6733r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ KeyEvent.Callback f6734s;

    public /* synthetic */ h(KeyEvent.Callback callback, int i10) {
        this.f6733r = i10;
        this.f6734s = callback;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        switch (this.f6733r) {
            case 1:
                p251z9.j.e(editable, "s");
                String string = editable.toString();
                int length = string.length();
                NoteActivity noteActivity = (NoteActivity) this.f6734s;
                int iG1 = o.g1(string, '\n', noteActivity.f13909Y, 4);
                if (iG1 == -1) {
                    iG1 = 0;
                }
                int i10 = noteActivity.f13910Z + 1;
                if (i10 >= length) {
                    i10 = length;
                }
                int iB1 = o.b1(string, '\n', i10, 4);
                if (iB1 != -1) {
                    length = iB1;
                }
                if (length == iG1 && iG1 > 0) {
                    iG1 = o.g1(string, '\n', iG1 - 1, 4);
                }
                if (length <= iG1) {
                    p192t6.f.b(noteActivity, editable, 0, editable.length());
                } else {
                    p192t6.f.b(noteActivity, editable, iG1, length);
                }
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        switch (this.f6733r) {
            case 1:
                p251z9.j.e(charSequence, "s");
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        switch (this.f6733r) {
            case 0:
                ((SearchView) this.f6734s).f15133B.setVisibility(charSequence.length() > 0 ? 0 : 8);
                break;
            case 1:
                p251z9.j.e(charSequence, "s");
                NoteActivity noteActivity = (NoteActivity) this.f6734s;
                noteActivity.f13909Y = i10;
                noteActivity.f13910Z = i10 + i12;
                break;
            default:
                androidx.appcompat.widget.SearchView searchView = (androidx.appcompat.widget.SearchView) this.f6734s;
                Editable text = searchView.f11592G.getText();
                searchView.f11621r0 = text;
                boolean zIsEmpty = TextUtils.isEmpty(text);
                searchView.v(!zIsEmpty);
                int i13 = 8;
                if (searchView.f11619p0 && !searchView.f11612i0 && zIsEmpty) {
                    searchView.f11597L.setVisibility(8);
                    i13 = 0;
                }
                searchView.f11599N.setVisibility(i13);
                searchView.r();
                searchView.u();
                if (searchView.f11608e0 != null && !TextUtils.equals(charSequence, searchView.f11620q0)) {
                    Q0 q10 = searchView.f11608e0;
                    String string = charSequence.toString();
                    V v10 = (V) q10;
                    if (string != null) {
                        J1 j10 = (J1) v10.f20603r;
                        if (((p239y6.a) j10.f14057d).f24653e) {
                            ((I4.e) j10.f14056c).e(string);
                        }
                    } else {
                        v10.getClass();
                    }
                }
                searchView.f11620q0 = charSequence.toString();
                break;
        }
    }

    private final void a(Editable editable) {
    }

    private final void b(Editable editable) {
    }

    private final void c(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void d(int i10, int i11, int i12, CharSequence charSequence) {
    }
}
