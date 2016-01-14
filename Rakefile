require 'fileutils'

task :default => ["build",  'clean', 'open']

# 本体のtexファイル名
name = "paper"

task :build do
  # srcディレクトリ下のmdファイルをtexに変換
  Dir.glob("src/*.md").map { |md|
    tex = md.sub(".md",  ".tex")
    `pandoc #{md} -o #{tex}`
  }

  puts `latex --shell-escape src/#{name}.tex`
  # リファレンス用に2回
  puts `platex --shell-escape src/#{name}.tex`
  puts `dvipdfmx #{name}.dvi`
  Dir.mkdir('build') unless FileTest.exists? 'build'
  puts `mv #{name}.pdf build/`
end

# mdから変換したtexファイルを削除
task :clean do
  Dir.glob("src/*.md").map { |md|
    tex = md.sub(".md",  ".tex")
    if md != 'src/paper.tex'
      `rm #{tex}`
    end
  }

  `rm *.log`
  `rm *.aux`
  `rm *.dvi `
end

# pdfを開く
task :open do
  `open build/paper.pdf`
end
