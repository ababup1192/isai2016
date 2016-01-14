# markdown_latex
いろんなところからパクったマークダウンで書くlatax。

# 依存ツール
- Ruby
- rake
- pandoc

# 使い方
これで基本的に大丈夫。気に食わなかったらRakefileをいじる。
   
    % rake

# 注意
プリアンブルに以下のパッケージを入れてないとエラーになる。
   
    \usepackage{longtable}
    \usepackage{booktabs}
    \usepackage{url}
    \usepackage[dvipdfmx]{graphicx}

\input や ファイルを指定するときは、src からの相対パスにする。
   
    src/img/latex
  
  
