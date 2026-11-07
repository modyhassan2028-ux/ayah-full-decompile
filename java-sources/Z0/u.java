package Z0;

import U0.K;
import android.R;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class u implements InputConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final B f10940a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f10941b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f10942c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public y f10943d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f10944e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f10945f;
    public final ArrayList g = new ArrayList();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f10946h = true;

    public u(y yVar, B b5, boolean z10) {
        this.f10940a = b5;
        this.f10941b = z10;
        this.f10943d = yVar;
    }

    public final void a(InterfaceC0716g interfaceC0716g) {
        this.f10942c++;
        try {
            this.g.add(interfaceC0716g);
        } finally {
            b();
        }
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [y9.c, z9.k] */
    public final boolean b() {
        int i10 = this.f10942c - 1;
        this.f10942c = i10;
        if (i10 == 0) {
            ArrayList arrayList = this.g;
            if (!arrayList.isEmpty()) {
                ((C) this.f10940a.f10875s).f10880e.e(p120l9.m.D0(arrayList));
                arrayList.clear();
            }
        }
        return this.f10942c > 0;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        boolean z10 = this.f10946h;
        if (!z10) {
            return z10;
        }
        this.f10942c++;
        return true;
    }

    public final void c(int i10) {
        sendKeyEvent(new KeyEvent(0, i10));
        sendKeyEvent(new KeyEvent(1, i10));
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int i10) {
        boolean z10 = this.f10946h;
        if (z10) {
            return false;
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        this.g.clear();
        this.f10942c = 0;
        this.f10946h = false;
        ArrayList arrayList = ((C) this.f10940a.f10875s).f10883i;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (p251z9.j.a(((WeakReference) arrayList.get(i10)).get(), this)) {
                arrayList.remove(i10);
                return;
            }
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCompletion(CompletionInfo completionInfo) {
        boolean z10 = this.f10946h;
        if (z10) {
            return false;
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i10, Bundle bundle) {
        boolean z10 = this.f10946h;
        if (z10) {
            return false;
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        boolean z10 = this.f10946h;
        return z10 ? this.f10941b : z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i10) {
        boolean z10 = this.f10946h;
        if (z10) {
            a(new C0710a(String.valueOf(charSequence), i10));
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i10, int i11) {
        boolean z10 = this.f10946h;
        if (!z10) {
            return z10;
        }
        a(new C0714e(i10, i11));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i10, int i11) {
        boolean z10 = this.f10946h;
        if (!z10) {
            return z10;
        }
        a(new C0715f(i10, i11));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        return b();
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        boolean z10 = this.f10946h;
        if (!z10) {
            return z10;
        }
        a(new i());
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i10) {
        y yVar = this.f10943d;
        return TextUtils.getCapsMode(yVar.f10953a.f8060s, K.e(yVar.f10954b), i10);
    }

    @Override // android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i10) {
        boolean z10 = (i10 & 1) != 0;
        this.f10945f = z10;
        if (z10) {
            this.f10944e = extractedTextRequest != null ? extractedTextRequest.token : 0;
        }
        return F9.n.U(this.f10943d);
    }

    @Override // android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getSelectedText(int i10) {
        if (K.b(this.f10943d.f10954b)) {
            return null;
        }
        return Y2.a.L(this.f10943d).f8060s;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextAfterCursor(int i10, int i11) {
        return Y2.a.P(this.f10943d, i10).f8060s;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextBeforeCursor(int i10, int i11) {
        return Y2.a.Q(this.f10943d, i10).f8060s;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i10) {
        boolean z10 = this.f10946h;
        if (z10) {
            z10 = false;
            switch (i10) {
                case R.id.selectAll:
                    a(new x(0, this.f10943d.f10953a.f8060s.length()));
                    break;
                case R.id.cut:
                    c(277);
                    return false;
                case R.id.copy:
                    c(278);
                    return false;
                case R.id.paste:
                    c(279);
                    return false;
                default:
                    return false;
            }
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performEditorAction(int i10) {
        int i11;
        boolean z10 = this.f10946h;
        if (z10) {
            z10 = true;
            if (i10 != 0) {
                switch (i10) {
                    case 2:
                        i11 = 2;
                        break;
                    case 3:
                        i11 = 3;
                        break;
                    case 4:
                        i11 = 4;
                        break;
                    case 5:
                        i11 = 6;
                        break;
                    case 6:
                        i11 = 7;
                        break;
                    case 7:
                        i11 = 5;
                        break;
                    default:
                        Log.w("RecordingIC", "IME sends unsupported Editor Action: " + i10);
                        i11 = 1;
                        break;
                }
            } else {
                i11 = 1;
            }
            ((C) this.f10940a.f10875s).f10881f.e(new j(i11));
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        boolean z10 = this.f10946h;
        if (z10) {
            return true;
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean reportFullscreenMode(boolean z10) {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x0065 A[Catch: all -> 0x006f, TryCatch #0 {all -> 0x006f, blocks: (B:44:0x005b, B:46:0x0065, B:48:0x006b, B:51:0x0071), top: B:57:0x005b }] */
    /* JADX WARN: Code duplicated, block: B:48:0x006b A[Catch: all -> 0x006f, TryCatch #0 {all -> 0x006f, blocks: (B:44:0x005b, B:46:0x0065, B:48:0x006b, B:51:0x0071), top: B:57:0x005b }] */
    /* JADX WARN: Code duplicated, block: B:57:0x005b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // android.view.inputmethod.InputConnection
    public final boolean requestCursorUpdates(int i10) {
        boolean z10;
        boolean z11;
        boolean z12;
        C0712c c0712c;
        boolean z13 = this.f10946h;
        if (!z13) {
            return z13;
        }
        boolean z14 = false;
        boolean z15 = (i10 & 1) != 0;
        boolean z16 = (i10 & 2) != 0;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 33) {
            z11 = (i10 & 16) != 0;
            z12 = (i10 & 8) != 0;
            boolean z17 = (i10 & 4) != 0;
            if (i11 >= 34 && (i10 & 32) != 0) {
                z14 = true;
            }
            if (z11 || z12 || z17 || z14) {
                z10 = z14;
                z14 = z17;
            } else {
                if (i11 >= 34) {
                    z10 = true;
                    z14 = true;
                } else {
                    z10 = z14;
                    z14 = true;
                }
                z11 = z14;
            }
            c0712c = ((C) this.f10940a.f10875s).f10885l;
            synchronized (c0712c.f10905c) {
                try {
                    c0712c.f10908f = z11;
                    c0712c.g = z12;
                    c0712c.f10909h = z14;
                    c0712c.f10910i = z10;
                    if (z15) {
                        c0712c.f10907e = true;
                        if (c0712c.j != null) {
                            c0712c.a();
                        }
                    }
                    c0712c.f10906d = z16;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return true;
        }
        z10 = false;
        z11 = true;
        z12 = z11;
        c0712c = ((C) this.f10940a.f10875s).f10885l;
        synchronized (c0712c.f10905c) {
            c0712c.f10908f = z11;
            c0712c.g = z12;
            c0712c.f10909h = z14;
            c0712c.f10910i = z10;
            if (z15) {
                c0712c.f10907e = true;
                if (c0712c.j != null) {
                    c0712c.a();
                }
            }
            c0712c.f10906d = z16;
            return true;
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, k9.g] */
    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        boolean z10 = this.f10946h;
        if (!z10) {
            return z10;
        }
        ((BaseInputConnection) ((C) this.f10940a.f10875s).j.getValue()).sendKeyEvent(keyEvent);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i10, int i11) {
        boolean z10 = this.f10946h;
        if (z10) {
            a(new v(i10, i11));
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i10) {
        boolean z10 = this.f10946h;
        if (z10) {
            a(new w(String.valueOf(charSequence), i10));
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int i10, int i11) {
        boolean z10 = this.f10946h;
        if (!z10) {
            return z10;
        }
        a(new x(i10, i11));
        return true;
    }
}
